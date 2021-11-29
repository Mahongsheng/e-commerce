package com.ecommerce.basicInfo;

import com.ecommerce.basicInfo.vojo.company.CompanyEntryVO;
import com.ecommerce.basicInfo.vojo.company.GetCompanyVO;
import com.ecommerce.basicInfo.service.CompanyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BasicInfoApplication.class})
public class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;

    @Test
    public void testGetCompany(){

        GetCompanyVO getCompanyVO = new GetCompanyVO();
        getCompanyVO.setManId(1);

        CompanyEntryVO company = companyService.getCompany(getCompanyVO);
        Assert.assertEquals("东软",company.getNameCn());
        Assert.assertEquals("Here's the company",company.getDescription());
    }
}
