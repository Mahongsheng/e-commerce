package com.ecommerce.wallet.service;

import com.ecommerce.wallet.vojo.WalletFlowRecordVO;
import com.ecommerce.wallet.vojo.WalletFlowVO;
import com.ecommerce.wallet.vojo.WalletOrderVO;

import java.util.List;

/**
 * wallet流水服务接口
 * Created by yousabla on 2020/7/3.
 */

public interface WalletFlowService {

    /**
     * 充值
     * @return
     */
    Integer deposit(WalletFlowVO walletFlowVO);

    /**
     * 提现
     * @return
     */
    Integer withdraw(WalletFlowVO walletFlowVO);

    /**
     * 查看钱包流水
     */
    List<WalletFlowRecordVO> check(String accountName);

    /**
     * 支付
     * @return
     */
    Integer pay(WalletOrderVO WalletOrderVO);

    /**
     * 申请退款
     * @return
     */
    Boolean refund(WalletOrderVO WalletOrderVO);




}
