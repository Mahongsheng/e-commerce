package com.ecommerce.product;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.product.service.ProductEntryService;
import com.ecommerce.product.vojo.entry.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: ProductEntryService
 * @Description: 测试类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/15 14:59
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProductApplication.class})
public class ProductEntryServiceTest {
    @Autowired
    private ProductEntryService productEntryService;

    @Test
    public void testGetAllProduct(){
        GetAllProductVO getAllProductVO = new GetAllProductVO();
        getAllProductVO.setManId(1);
        getAllProductVO.setPageNum(1);
        getAllProductVO.setPageSize(1);
        CommonPage<ProductEntryVO> productEntryVOCommonPage = productEntryService.getAllProduct(getAllProductVO);

        List<ProductEntryVO> productEntryVOS = productEntryVOCommonPage.getList();
        Assert.assertEquals(1,productEntryVOS.size());
        Assert.assertEquals(10, (long)productEntryVOS.get(0).getProId());

//        for(ProductEntryVO productEntryVO : productEntryVOS){
//            System.out.println(productEntryVO.toString());
//        }
    }

    @Test
    public void testSearchProductByTitle(){
        SearchProductVO searchProductVO = new SearchProductVO();
        searchProductVO.setManId(11);
        searchProductVO.setPageNum(1);
        searchProductVO.setPageSize(1);
        searchProductVO.setTitle("QXL");
        CommonPage<ProductEntryVO> productEntryVOCommonPage = productEntryService.searchProductByTitle(searchProductVO);
        Assert.assertEquals(1,(long)productEntryVOCommonPage.getList().get(0).getProId());
        Assert.assertEquals("QXL", productEntryVOCommonPage.getList().get(0).getTitle());
//        Assert.assertEquals(123.00,productEntryVOCommonPage.getList().get(0).getRetailPrice());
        Assert.assertEquals("QXL",productEntryVOCommonPage.getList().get(0).getSkuCd());
    }

    @Test
    public void testAddProductInfo(){
        ProductAddVO productAddVO = new ProductAddVO();
        productAddVO.setEan("QXL");
        productAddVO.setHeight("1");
        productAddVO.setLength("2");
        productAddVO.setModel("qxlModel");
        productAddVO.setRetailPrice("123");
        productAddVO.setSkuCd("qxlSku");
        productAddVO.setTitle("qxlTitle");
        productAddVO.setUpc("qxlUpc");
        productAddVO.setWarrantyDay("qxlWarrantDay");
        productAddVO.setWeight("3");
        productAddVO.setWidth("4");
        productAddVO.setManId(11);
        productAddVO.setUserId("qxl12345");
        Assert.assertEquals(true,productEntryService.addProductInfo(productAddVO));
    }

    @Test
    public void testGetProductInfoWhenUpdate(){
        ProductAddVO productAddVO = productEntryService.getProductInfoWhenUpdate(22);
        Assert.assertEquals("qxlUpc",productAddVO.getUpc());
        Assert.assertEquals("qxlSku",productAddVO.getSkuCd());
    }

    @Test
    public void testUpdateProductInfo(){
        ProductUpdateVO productUpdateVO = new ProductUpdateVO();

        productUpdateVO.setEan("QXL");
        productUpdateVO.setHeight("1");
        productUpdateVO.setLength("2");
        productUpdateVO.setModel("qxlModel");
        productUpdateVO.setRetailPrice("123");
        productUpdateVO.setSkuCd("qxlSku");
        productUpdateVO.setTitle("qxlUpdateTitle");
        productUpdateVO.setUpc("qxlUpc");
        productUpdateVO.setWarrantyDay("qxlWarrantDay");
        productUpdateVO.setWeight("3");
        productUpdateVO.setWidth("4");
        productUpdateVO.setProId(22);
        productUpdateVO.setUserId("qxl12345");

        Assert.assertEquals(true,productEntryService.updateProductInfo(productUpdateVO));
    }

    @Test
    public void testDeleteProductInfo(){
        Assert.assertEquals(true,productEntryService.deleteProductInfo(22));
    }

}
