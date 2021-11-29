package com.ecommerce.product;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.product.service.ProductImageService;
import com.ecommerce.product.vojo.image.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: ProductImageServiceTest
 * @Description: java类作用描述
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/15 17:11
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProductApplication.class})
public class ProductImageServiceTest {
    @Autowired
    private ProductImageService productImageService;

    @Test
    public void testGetAllProductImage(){
        GetAllProductImageVO getAllProductImageVO = new GetAllProductImageVO();
        getAllProductImageVO.setManId(1);
        getAllProductImageVO.setPageNum(1);
        getAllProductImageVO.setPageSize(1);
        CommonPage<ProductImageVO> productImageVOCommonPage = productImageService.getAllProductImage(getAllProductImageVO);
        List<ProductImageVO> productImageVOs = productImageVOCommonPage.getList();
        Assert.assertEquals(10,(long)productImageVOs.get(0).getProId());
    }

    @Test
    public void testSearchProductImageByTitle(){
        SearchProductImageVO searchProductImageVO = new SearchProductImageVO();
        searchProductImageVO.setManId(11);
        searchProductImageVO.setPageNum(1);
        searchProductImageVO.setPageSize(1);
        searchProductImageVO.setTitle("马洪升专用测试用例化妆品");
        CommonPage<ProductImageVO> productImageVOCommonPage = productImageService.searchProductImageByTitle(searchProductImageVO);
        System.out.println(productImageVOCommonPage.getList().size());
//        Assert.assertEquals(null,productImageVOCommonPage.getList().get(0));
        Assert.assertEquals("化妆品",productImageVOCommonPage.getList().get(0).getCategoryName());
    }

//    @Test
//    public void testGetProductCatWhenUpdate(){
//        ProductCategoryAddVO productCategoryAddVO = productImageService.getProductCatWhenUpdate(13);
//
//    }

    @Test
    public void testUpdateProductImage(){
        ProductCategoryUpdateVO productCategoryUpdateVO = new ProductCategoryUpdateVO();
        productCategoryUpdateVO.setProId(13);
        productCategoryUpdateVO.setUserId("QXL123");
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        productCategoryUpdateVO.setCategory(ints);
        Assert.assertEquals(true,productImageService.updateProductImage(productCategoryUpdateVO));
    }

    @Test
    public void testGetGetAllCategory(){
        List<ProductCategoryVO> productCategoryVOs = productImageService.getAllCategory();
        Assert.assertEquals(1,(long)productCategoryVOs.get(0).getCatId());
        Assert.assertEquals(4,(long)productCategoryVOs.get(1).getCatId());
    }

}
