package com.ecommerce.admin;

import com.ecommerce.admin.vojo.AddCdmVO;
import com.ecommerce.admin.vojo.CdmInfoVO;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.admin.service.DataDictionaryService;
import com.ecommerce.admin.vojo.PageVO;
import com.ecommerce.admin.vojo.SearchCdmVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: DataDictionaryServiceTest
 * @Description: test类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/17 9:12
 */
@SpringBootTest(classes = {AdminApplication.class})
public class DataDictionaryServiceTest {
    @Autowired
    private DataDictionaryService dataDictionaryService;

    @Test
    public void testAdd() {
        AddCdmVO addCdmVO = new AddCdmVO();
        addCdmVO.setUserId("findfree");
        addCdmVO.setCdmCd("qiu");
        addCdmVO.setCdmValue("xiaolin");
        addCdmVO.setCdmType("good");
        addCdmVO.setDescription("testCase");
        AddCdmVO nullAddCdmVO = new AddCdmVO();
        boolean flag2 = dataDictionaryService.add(nullAddCdmVO);
        assertTrue(flag2);
    }

    @Test
    public void testGetAllCdmInfo() {
        PageVO pageVO = new PageVO();
        pageVO.setPageNum(1);
        pageVO.setPageSize(1);
        CommonPage<CdmInfoVO> cdmInfoVOCommonPage = dataDictionaryService.getAllCdmInfo(pageVO);
        assertEquals("男", cdmInfoVOCommonPage.getList().get(0).getCdmValue());
    }

    @Test
    public void testSearchCdm() {
        SearchCdmVO searchCdmVO = new SearchCdmVO();
        searchCdmVO.setPageNum(1);
        searchCdmVO.setPageSize(1);
        searchCdmVO.setCdmType("good");
        assertEquals("xiaolin", dataDictionaryService.searchCdm(searchCdmVO).getList().get(0).getCdmValue());
    }

    @Test
    public void testGetCdmWhenUpdate() {
        CdmInfoVO cdmInfoVO = dataDictionaryService.getCdmWhenUpdate(7);
    }
}
