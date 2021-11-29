package com.ecommerce.basicInfo;

import com.ecommerce.basicInfo.vojo.company.CompanyEntryVO;
import com.ecommerce.basicInfo.vojo.company.GetCompanyVO;
import com.ecommerce.basicInfo.service.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: Mytest
 * @Description: java类作用描述
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/15 21:46
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BasicInfoApplication.class})
public class Mytest {
    @Autowired
    private CompanyService companyService;

    @Test
    public void testCom(){
        GetCompanyVO getCompanyVO = new GetCompanyVO();
        getCompanyVO.setManId(2);
        CompanyEntryVO companyEntryVO = companyService.getCompany(getCompanyVO);
        System.out.println(companyEntryVO.toString());
//        Assert.assertEquals("HIDEONBUSH",companyEntryVO.getDescription());
    }
}
