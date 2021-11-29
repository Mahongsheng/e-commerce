package com.ecommerce.admin;

import com.ecommerce.admin.service.ParameterService;
import com.ecommerce.admin.vojo.AddParameterVO;
import com.ecommerce.admin.vojo.PageVO;
import com.ecommerce.admin.vojo.ParInfoVO;
import com.ecommerce.admin.vojo.SearchParVO;
import com.ecommerce.common.base.CommonPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: ParameterServiceTest
 * @Description:
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/17 10:35
 */
@SpringBootTest(classes = {AdminApplication.class})
public class ParameterServiceTest {
    @Autowired
    private ParameterService parameterService;

    @Test
    public void testAdd() {
        AddParameterVO addParameterVO = new AddParameterVO();
        addParameterVO.setDescription("Hi");
        addParameterVO.setParCd("qxlTest");
        addParameterVO.setParValue("qiuxiaolin");
        addParameterVO.setUserId("qiuxiaolin");
        parameterService.add(addParameterVO);
        PageVO pageVO = new PageVO();
        pageVO.setPageNum(1);
        pageVO.setPageSize(3);
        CommonPage<ParInfoVO> parInfoVOCommonPage = parameterService.getAllParInfo(pageVO);
        assertEquals("qiuxiaolin", parInfoVOCommonPage.getList().get(2).getParValue());
    }

    @Test
    public void testGetAllParInfo() {
        PageVO pageVO = new PageVO();
        pageVO.setPageSize(1);
        pageVO.setPageNum(1);
        CommonPage<ParInfoVO> parInfoVOCommonPage = parameterService.getAllParInfo(pageVO);
        assertEquals("7", parInfoVOCommonPage.getList().get(0).getParValue());
    }

    @Test
    public void testSearchPar() {
        SearchParVO searchParVO = new SearchParVO();
        searchParVO.setPageNum(1);
        searchParVO.setPageSize(1);
        searchParVO.setParCd("STOCK_TIME");
        CommonPage<ParInfoVO> parInfoVOCommonPage = parameterService.searchPar(searchParVO);
        assertEquals("7", parInfoVOCommonPage.getList().get(0).getParValue());
    }

    @Test
    public void testGetParWhenUpdate() {
        ParInfoVO parInfoVO = parameterService.getParWhenUpdate(1);
        assertEquals("qiuxiaolin", parInfoVO.getParValue());
    }
}
