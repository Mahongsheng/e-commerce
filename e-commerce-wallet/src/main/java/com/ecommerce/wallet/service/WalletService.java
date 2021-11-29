package com.ecommerce.wallet.service;

import com.ecommerce.wallet.vojo.WalletAccountVO;
import com.ecommerce.wallet.vojo.WalletBalanceVO;
import com.ecommerce.wallet.vojo.WalletPasswordVO;

import java.util.List;

/**
 * wallet服务接口
 * Created by yousabla on 2020/7/3.
 */
public interface WalletService {

    /**
     * 注册新的钱包
     */
    Boolean addWallet(WalletAccountVO walletAccountVO);

    /**
     * 获取钱包信息
     * @return
     */
    List<WalletBalanceVO> getWalletInfo(String accountName);

    /**
     * 更改支付密码
     */
    Boolean changePassword(WalletPasswordVO passwordVO);


}
