package com.ecommerce;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.service.DataDictionaryService;
import com.ecommerce.vojo.AddCdmVO;
import com.ecommerce.vojo.CdmInfoVO;
import com.ecommerce.vojo.PageVO;
import com.ecommerce.vojo.SearchCdmVO;
import com.github.pagehelper.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.parameters.P;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: DataDictionaryServiceTest
 * @Description: test类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/17 9:12
 */
@SpringBootTest(classes = {AdminApplication.class})
@RunWith(SpringRunner.class)
public class DataDictionaryServiceTest {
    @Autowired
    private DataDictionaryService dataDictionaryService;

    @Test
    public void testAdd(){
        AddCdmVO addCdmVO = new AddCdmVO();
        addCdmVO.setUserId("findfree");
        addCdmVO.setCdmCd("qiu");
        addCdmVO.setCdmValue("xiaolin");
        addCdmVO.setCdmType("good");
        addCdmVO.setDescription("testCase");
//        boolean flag = dataDictionaryService.add(addCdmVO);
//        Assert.assertEquals(true,flag);
        AddCdmVO nullAddCdmVO = new AddCdmVO();
        boolean flag2 = dataDictionaryService.add(nullAddCdmVO);
        Assert.assertEquals(true,flag2);
    }

    @Test
    public void testGetAllCdmInfo(){
        PageVO pageVO = new PageVO();
        pageVO.setPageNum(1);
        pageVO.setPageSize(1);
        CommonPage<CdmInfoVO> cdmInfoVOCommonPage  = dataDictionaryService.getAllCdmInfo(pageVO);
        Assert.assertEquals("男",cdmInfoVOCommonPage.getList().get(0).getCdmValue());
    }

    @Test
    public void testSearchCdm(){
        SearchCdmVO searchCdmVO = new SearchCdmVO();
        searchCdmVO.setPageNum(1);
        searchCdmVO.setPageSize(1);
        searchCdmVO.setCdmType("good");
        Assert.assertEquals("xiaolin",dataDictionaryService.searchCdm(searchCdmVO).getList().get(0).getCdmValue());
    }

    @Test
    public void testGetCdmWhenUpdate(){
        CdmInfoVO cdmInfoVO = dataDictionaryService.getCdmWhenUpdate(7);
        Assert.assertEquals("xiaolin",cdmInfoVO.getCdmValue());
    }
}
