package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private Long id;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 头像
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "头像")
    private String icon;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /**
     * 备注信息
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注信息")
    private String note;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 最后登录时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "最后登录时间")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "帐号启用状态：0->禁用；1->启用")
    private Integer status;

    /**
     * 公司id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "公司id")
    private Integer manId;

    /**
     * 借卖方id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "借卖方id")
    private Integer manBuyerId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public Integer getManBuyerId() {
        return manBuyerId;
    }

    public void setManBuyerId(Integer manBuyerId) {
        this.manBuyerId = manBuyerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append(", manId=").append(manId);
        sb.append(", manBuyerId=").append(manBuyerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}