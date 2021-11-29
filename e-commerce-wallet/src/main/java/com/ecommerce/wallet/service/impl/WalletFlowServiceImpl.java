package com.ecommerce.wallet.service.impl;

import com.ecommerce.mybatis.dao.WaaWalletAccountMapper;
import com.ecommerce.mybatis.dao.WtrWalletTransactionRecordMapper;
import com.ecommerce.mybatis.pojo.WaaWalletAccount;
import com.ecommerce.mybatis.pojo.WaaWalletAccountExample;
import com.ecommerce.mybatis.pojo.WtrWalletTransactionRecord;
import com.ecommerce.mybatis.pojo.WtrWalletTransactionRecordExample;
import com.ecommerce.wallet.service.WalletFlowService;
import com.ecommerce.wallet.vojo.WalletFlowRecordVO;
import com.ecommerce.wallet.vojo.WalletFlowVO;
import com.ecommerce.wallet.vojo.WalletOrderVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 钱包流水服务实现类
 * Created by yousabla on 2020/7/3.
 */

@Service
public class WalletFlowServiceImpl implements WalletFlowService {
    @Resource
    WaaWalletAccountMapper waaWalletAccountMapper;

    @Resource
    WtrWalletTransactionRecordMapper wtrWalletTransactionRecordMapper;

    @Override
    public Integer deposit(WalletFlowVO walletFlowVO) {
        WaaWalletAccountExample example = new WaaWalletAccountExample();
        example.createCriteria().andAccountNameEqualTo(walletFlowVO.getAccountName());
        List<WaaWalletAccount> accounts = waaWalletAccountMapper.selectByExample(example);
        if (accounts == null || accounts.isEmpty()) {
            return -1;
        }

        WaaWalletAccount account = accounts.get(0);
        if (account.getPassword().equals(DigestUtils.sha1Hex(walletFlowVO.getPassword()))) {
            account.setDepositingMoney(walletFlowVO.getFlow());
            waaWalletAccountMapper.updateByPrimaryKeySelective(account);
            generateTransaction(account.getBuyerId(), 2, 1, walletFlowVO.getFlow());
            return 1;
        } else {
            generateTransaction(account.getBuyerId(), 1, 1, walletFlowVO.getFlow());
            return -2;
        }
    }

    @Override
    public Integer withdraw(WalletFlowVO walletFlowVO) {
        WaaWalletAccountExample example = new WaaWalletAccountExample();
        example.createCriteria().andAccountNameEqualTo(walletFlowVO.getAccountName());
        List<WaaWalletAccount> accounts = waaWalletAccountMapper.selectByExample(example);
        if (accounts == null || accounts.isEmpty()) {
            return -1;
        }

        WaaWalletAccount account = accounts.get(0);
        if (account.getPassword().equals(DigestUtils.sha1Hex(walletFlowVO.getPassword()))) {
            if (account.getAvailableMoney().compareTo(walletFlowVO.getFlow()) > -1) {
                account.setWithdrawingMoney(walletFlowVO.getFlow());
                waaWalletAccountMapper.updateByPrimaryKeySelective(account);
                generateTransaction(account.getBuyerId(), 2, 2, walletFlowVO.getFlow());
                return 1;
            } else {
                generateTransaction(account.getBuyerId(), 1, 2, walletFlowVO.getFlow());
                return -3;
            }
        } else {
            generateTransaction(account.getBuyerId(), 1, 2, walletFlowVO.getFlow());
            return -2;
        }
    }

    @Override
    public List<WalletFlowRecordVO> check(String accountName) {
        int buyerId = waaWalletAccountMapper.getIdByName(accountName);
        WtrWalletTransactionRecordExample example = new WtrWalletTransactionRecordExample();
        example.createCriteria().andBuyerIdEqualTo(buyerId);
        List<WtrWalletTransactionRecord> records = wtrWalletTransactionRecordMapper.selectByExample(example);
        if (records == null || records.isEmpty()) {
            return null;
        }

        List<WalletFlowRecordVO> recordVOS = new ArrayList<>();
        records.forEach(record -> {
            WalletFlowRecordVO recordVO = new WalletFlowRecordVO();
            BeanUtils.copyProperties(record, recordVO);
            recordVOS.add(recordVO);
        });
        return recordVOS;
    }

    private void generateTransaction(Integer buyerId, int status, int transactionType, BigDecimal transactionMoney) {
        //生成流水记录
        WtrWalletTransactionRecord recordVO = new WtrWalletTransactionRecord();
        recordVO.setCreateTime(new Date());
        recordVO.setBuyerId(buyerId);
        recordVO.setTransactionMoney(transactionMoney);
        recordVO.setTransactionType((byte) transactionType);
        recordVO.setTransactionNumber(generateTransactionNumber());
        recordVO.setStatus((byte) status);
        wtrWalletTransactionRecordMapper.insertSelective(recordVO);
    }

    //生成流水号
    private String generateTransactionNumber() {
        SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdfTime.format(new Date()).replaceAll("[[\\s-:punct:]]", "") + (int) (Math.random() * 999999);
    }

    @Override
    public Integer pay(WalletOrderVO walletOrderVO) {
        WaaWalletAccountExample example = new WaaWalletAccountExample();
        example.createCriteria().andAccountNameEqualTo(walletOrderVO.getAccountName());
        List<WaaWalletAccount> accounts = waaWalletAccountMapper.selectByExample(example);
        if (accounts == null || accounts.isEmpty()) {
            return -1;
        }

        WaaWalletAccount account = accounts.get(0);
        if (account.getPassword().equals(DigestUtils.sha1Hex(walletOrderVO.getPassword()))) {
            if (account.getAvailableMoney().compareTo(walletOrderVO.getFlow()) > -1){
                account.setAvailableMoney(account.getAvailableMoney().subtract(walletOrderVO.getFlow()));
                account.setLastUpdateTime(new Date());

                waaWalletAccountMapper.updateByPrimaryKeySelective(account);
                generateTransaction(account.getBuyerId(), 2, 3, walletOrderVO.getFlow());
                return 1;
            }else {
                generateTransaction(account.getBuyerId(), 1, 3, walletOrderVO.getFlow());
                return -2;
            }
        } else {
            generateTransaction(account.getBuyerId(), 1, 3, walletOrderVO.getFlow());
            return -3;
        }
    }

    @Override
    public Boolean refund(WalletOrderVO walletOrderVO) {
        WaaWalletAccountExample example = new WaaWalletAccountExample();
        example.createCriteria().andAccountNameEqualTo(walletOrderVO.getAccountName());
        List<WaaWalletAccount> accounts = waaWalletAccountMapper.selectByExample(example);
        if (accounts == null || accounts.isEmpty()) {
            return false;
        }

        WaaWalletAccount account = accounts.get(0);
        account.setAvailableMoney(account.getAvailableMoney().add(walletOrderVO.getFlow()));
        account.setLastUpdateTime(new Date());
        generateTransaction(account.getBuyerId(), 2, 4, walletOrderVO.getFlow());
        return true;
    }

}
