package com.ecommerce.wallet.service.impl;

import com.ecommerce.mybatis.dao.WaaWalletAccountMapper;
import com.ecommerce.mybatis.pojo.WaaWalletAccount;
import com.ecommerce.mybatis.pojo.WaaWalletAccountExample;
import com.ecommerce.redis.service.RedisService;
import com.ecommerce.wallet.service.WalletService;
import com.ecommerce.wallet.vojo.WalletAccountVO;
import com.ecommerce.wallet.vojo.WalletBalanceVO;
import com.ecommerce.wallet.vojo.WalletPasswordVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * wallet服务实现类
 * Created by yousabla on 2020/7/3.
 */

@Service
public class WalletServiceImpl implements WalletService {

    @Resource
    WaaWalletAccountMapper waaWalletAccountMapper;

    @Resource
    RedisService redisService;

    @Override
    public Boolean addWallet(WalletAccountVO walletAccountVO) {
        WaaWalletAccountExample example = new WaaWalletAccountExample();
        example.createCriteria().andAccountNameEqualTo(walletAccountVO.getAccountName());
        List<WaaWalletAccount> accounts = waaWalletAccountMapper.selectByExample(example);
        if (!accounts.isEmpty()){
            return false;
        }

        WaaWalletAccount walletAccount = new WaaWalletAccount();
        walletAccount.setAccountName(walletAccountVO.getAccountName());
        //SHA加密
        walletAccount.setPassword(DigestUtils.sha1Hex(walletAccountVO.getPassword()));
        walletAccount.setStatus((byte) 7);

        walletAccount.setAvailableMoney(BigDecimal.ZERO);
        walletAccount.setDepositingMoney(BigDecimal.ZERO);
        walletAccount.setWithdrawingMoney(BigDecimal.ZERO);
        walletAccount.setCreateTime(new Date());

        return waaWalletAccountMapper.insertSelective(walletAccount) == 1;
    }


    @Override
    public List<WalletBalanceVO> getWalletInfo(String accountName) {
        WaaWalletAccountExample example = new WaaWalletAccountExample();
        example.createCriteria().andAccountNameEqualTo(accountName);
        List<WaaWalletAccount> accounts = waaWalletAccountMapper.selectByExample(example);
        if (accounts == null || accounts.isEmpty()) {
            return null;
        }
        List<WalletBalanceVO> balanceVOS = new ArrayList<>();
        for (WaaWalletAccount account:accounts) {

//            redisService.set(accountName+"Balance",account.getAvailableMoney());
            WalletBalanceVO balanceVO = new WalletBalanceVO();
            BeanUtils.copyProperties(account,balanceVO);
            balanceVOS.add(balanceVO);
        }
        return balanceVOS;
    }

    @Override
    public Boolean changePassword(WalletPasswordVO passwordVO) {
        WaaWalletAccount account = waaWalletAccountMapper.selectByPrimaryKey(waaWalletAccountMapper.getIdByName(passwordVO.getAccountName()));
        if (account == null) {return false;}
        if (DigestUtils.sha1Hex(passwordVO.getOldPassword()).equals(account.getPassword())) {
            account.setPassword(DigestUtils.sha1Hex(passwordVO.getNewPassword()));
            waaWalletAccountMapper.updateByPrimaryKeySelective(account);
            return true;
        } else {
            return false;
        }
    }


}
