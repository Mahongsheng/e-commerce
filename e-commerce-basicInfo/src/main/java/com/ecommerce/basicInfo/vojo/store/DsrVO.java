package com.ecommerce.basicInfo.vojo.store;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vojo.store
 * @ClassName: DsrVO
 * @Description: 前端往后端穿的借卖方信息
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/10 9:03
 */
@Getter
@Setter
public class DsrVO {
    String name;
    String createdBy;
    Date creationDate;
    int dsrId;
}
