package com.ecommerce.admin.service.impl;

import com.ecommerce.admin.service.WalletAdminService;
import com.ecommerce.admin.vojo.PageVO;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.WaaWalletAccountMapper;
import com.ecommerce.mybatis.dao.WtrWalletTransactionRecordMapper;
import com.ecommerce.mybatis.pojo.WaaWalletAccount;
import com.ecommerce.mybatis.pojo.WtrWalletTransactionRecord;
import com.ecommerce.mybatis.pojo.WtrWalletTransactionRecordExample;
import com.ecommerce.admin.vojo.WalletAdminVO;
import com.ecommerce.admin.vojo.WalletAuditVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 管理员-钱包流水服务实现类
 * Created by yousabla on 2020/7/5.
 */

@Service
public class WalletAdminServiceImpl implements WalletAdminService {
    @Resource
    WaaWalletAccountMapper waaWalletAccountMapper;

    @Resource
    WtrWalletTransactionRecordMapper wtrWalletTransactionRecordMapper;

    @Override
    public CommonPage<WalletAdminVO> getAllFlow(PageVO vo) {
        Page<WtrWalletTransactionRecord> flowPage = PageHelper.startPage(vo.getPageNum(), vo.getPageSize()).doSelectPage(() -> {
            WtrWalletTransactionRecordExample example = new WtrWalletTransactionRecordExample();
            example.createCriteria().andStatusEqualTo((byte) 2);
            wtrWalletTransactionRecordMapper.selectByExample(example);
        });

        List<WalletAdminVO> flows = new ArrayList<>();
        for (WtrWalletTransactionRecord record:flowPage.getResult()) {
            WalletAdminVO flow = new WalletAdminVO();
            flow.setAccountName(record.getAccountName());
            flow.setAvailableMoney(record.getTransactionMoney());
            flow.setCreateTime(record.getCreateTime());
            flow.setStatus((byte)2);
            flow.setTransactionType(record.getTransactionType());
            flow.setTransactionNumber(record.getTransactionNumber());
            flows.add(flow);
        }
        return CommonPage.restPage(flows,flowPage);
    }

    @Override
    public Boolean audit(WalletAuditVO walletAuditVO) {
        WtrWalletTransactionRecordExample example = new WtrWalletTransactionRecordExample();
        example.createCriteria().andTransactionNumberEqualTo(walletAuditVO.getTransactionNumber());
        List<WtrWalletTransactionRecord> records = wtrWalletTransactionRecordMapper.selectByExample(example);
        WtrWalletTransactionRecord record = records.get(0);
        if (record == null) {
            return false;
        }

        WaaWalletAccount account = waaWalletAccountMapper.selectByPrimaryKey(record.getBuyerId());

        if (walletAuditVO.getStatus()){
            record.setStatus((byte) 4);
            switch (record.getTransactionType()){
                //充值
                case (byte) 1:{
                    account.setDepositingMoney(account.getDepositingMoney().subtract(record.getTransactionMoney()));
                    account.setAvailableMoney(account.getAvailableMoney().add(record.getTransactionMoney()));
                    account.setLastUpdateTime(new Date());
                    break;
                }
                //提现
                case (byte) 2:{
                    account.setWithdrawingMoney(account.getWithdrawingMoney().subtract(record.getTransactionMoney()));
                    account.setAvailableMoney(account.getAvailableMoney().subtract(record.getTransactionMoney()));
                    account.setLastUpdateTime(new Date());
                    break;
                }
                //退款
                case (byte) 4:{
                    account.setAvailableMoney(account.getAvailableMoney().add(record.getTransactionMoney()));
                    account.setLastUpdateTime(new Date());
                    break;
                }
                default:{}
            }
        }else {
            record.setStatus((byte) 1);
        }
        record.setNote(walletAuditVO.getNote());
        return wtrWalletTransactionRecordMapper.updateByPrimaryKeySelective(record) > 0;
    }
}
