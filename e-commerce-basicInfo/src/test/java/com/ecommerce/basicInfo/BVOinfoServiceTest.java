package com.ecommerce.basicInfo;

import com.ecommerce.basicInfo.service.BVOInfoService;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOEntryVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoInitVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.GetBVOVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: BVOinfoServiceTest
 * @Description: java类作用描述
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/16 16:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BasicInfoApplication.class})
public class BVOinfoServiceTest {
    @Autowired
    private BVOInfoService bvoInfoService;

    @Test
    public void testGetBVO(){
        GetBVOVO getBVOVO = new GetBVOVO();
        getBVOVO.setDsrId(1);

        BVOEntryVO bvoEntryVO = bvoInfoService.getBVO(getBVOVO);
        Assert.assertEquals("abc",bvoEntryVO.getEmail());
        Assert.assertEquals("123",bvoEntryVO.getPhoneNumber());
        Assert.assertEquals("qiuxiaolin",bvoEntryVO.getName());
    }

    @Test
    public void testInitBVOInfo(){
        BVOInfoInitVO bvoInfoInitVO = new BVOInfoInitVO();
        bvoInfoInitVO.setCallCnt(0);
        bvoInfoInitVO.setCreatedBy("qxl");
        bvoInfoInitVO.setDsrId(10086);
        bvoInfoInitVO.setEmail("10086");
        bvoInfoInitVO.setName("10086");
        bvoInfoInitVO.setPhoneNumber("10086");
        boolean result = bvoInfoService.initBVOInfo(bvoInfoInitVO);
        Assert.assertEquals(true,result);
    }

    @Test
    public void testUpdateBVOInfo(){
        BVOInfoUpdateVO bvoInfoUpdateVO = new BVOInfoUpdateVO();
        bvoInfoUpdateVO.setDsrId(10086);
        bvoInfoUpdateVO.setName("updateqxl");
        boolean result = bvoInfoService.updateBVOInfo(bvoInfoUpdateVO);
        Assert.assertEquals(true,result);
    }
}
