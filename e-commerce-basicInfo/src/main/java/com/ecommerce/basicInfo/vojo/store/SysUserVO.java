package com.ecommerce.basicInfo.vojo.store;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vojo.store
 * @ClassName: SysUserVO
 * @Description: java类作用描述
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/10 14:43
 */
public class SysUserVO {
    @ApiModelProperty(value = "借卖方id")
    private int manBuyerId;
    private String userName;
    private String passWord;

    public int getManBuyerId() {
        return manBuyerId;
    }

    public void setManBuyerId(int manBuyerId) {
        this.manBuyerId = manBuyerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
