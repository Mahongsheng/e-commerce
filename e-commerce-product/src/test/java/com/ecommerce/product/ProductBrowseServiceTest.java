package com.ecommerce.product;

import com.ecommerce.product.service.ProductBrowseService;
import com.ecommerce.product.vojo.browse.ProductDetailVO;
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
 * @ClassName: ProductBrowseServiceTest
 * @Description: ProductBrowseService测试类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/15 9:35
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProductApplication.class})
public class ProductBrowseServiceTest {
    @Autowired
    private ProductBrowseService productBrowseService;

//    @Test
//    public void testGetAllProductWithStatD(){
//        List<ProductBrowseWithCatVO> productBrowseWithCatVOS = productBrowseService.getAllProductWithStatD();
//        //储存期望值
//        List<ProductBrowseWithCatVO> respects = new ArrayList<>();
//        //测试用例1
//        ProductBrowseWithCatVO temp = new ProductBrowseWithCatVO();
//        temp.setCatName("大家电");
//        List<ProductBrowseDTO> productBrowseDTOS1 = new ArrayList<>();
//        ProductBrowseDTO productBrowseDTO1 = new ProductBrowseDTO(16, "https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/m-img/item-detail-1.jpg","马洪升专用测试用例冰箱", null, "666.00");
//        ProductBrowseDTO productBrowseDTO2 = new ProductBrowseDTO(16, "https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/m-img/item-detail-2.jpg", "马洪升专用测试用例冰箱", null,"666.00");
//        productBrowseDTOS1.add(productBrowseDTO1);
//        productBrowseDTOS1.add(productBrowseDTO2);
//        temp.setProducts(productBrowseDTOS1);
//        respects.add(temp);
//        //测试用例2
//        ProductBrowseWithCatVO temp2 = new ProductBrowseWithCatVO();
//        temp.setCatName("'化妆品'");
//        List<ProductBrowseDTO> productBrowseDTOS2 = new ArrayList<>();
//        ProductBrowseDTO productBrowseDTO3 = new ProductBrowseDTO(13, "https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1593771713868.png","马洪升专用测试用例化妆品", null, "666.00");
//        productBrowseDTOS2.add(productBrowseDTO3);
//        temp2.setProducts(productBrowseDTOS2);
//        respects.add(temp2);
////        Assert.assertEquals(respects,productBrowseWithCatVOS);
//        for(ProductBrowseWithCatVO productBrowseWithCatVO : productBrowseWithCatVOS){
//            System.out.println(productBrowseWithCatVO.toString());
//        }
////
////
////        catName='大家电', products=[ProductBrowseDTO(proId=16, image=https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/m-img/item-detail-1.jpg, title=马洪升专用测试用例冰箱, minRetailPrice=null, retailPrice=666.00), ProductBrowseDTO(proId=16, image=https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/m-img/item-detail-2.jpg, title=马洪升专用测试用例冰箱, minRetailPrice=null, retailPrice=666.00)]
////        catName='化妆品', products=[ProductBrowseDTO(proId=13, image=https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1593771713868.png, title=马洪升专用测试用例化妆品, minRetailPrice=null, retailPrice=123.00)]
//    }


//    @Test
//    public void testGetProductInfoDetailById(){
//        int proId = 13;
//        ProductDetailVO productDetailVO = productBrowseService.getProductInfoDetailById(proId);
//        ProductDetailVO productDetailVOTest = new ProductDetailVO();
//        List<String> images = new ArrayList<>();
//        images.add("https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1593771713868.png");
//        productDetailVOTest.setImages(images);
//        productDetailVOTest.setMainCatName("化妆品");
//        productDetailVOTest.setMinRetailPrice(null);
//        productDetailVOTest.setProId(13);
//        productDetailVOTest.setRetailPrice("123.00");
//        productDetailVOTest.setTitle("马洪升专用测试用例化妆品");
//        productDetailVOTest.setViceCatName("粉底");
//        Assert.assertEquals(productDetailVOTest,productDetailVO);
//    }

    @Test
    public void testGetProductInfoDetailById() {
        int dsrId = 1;
        int proId = 13;
        ProductDetailVO productDetailVO = productBrowseService.getProductInfoDetailById(dsrId, proId);
        ProductDetailVO productDetailVOTest = new ProductDetailVO();
        List<String> images = new ArrayList<>();
        images.add("https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1593771713868.png");
        productDetailVOTest.setImages(images);
        productDetailVOTest.setMainCatName("化妆品");
        productDetailVOTest.setMinRetailPrice(null);
        productDetailVOTest.setProId(13);
        productDetailVOTest.setRetailPrice("123.00");
        productDetailVOTest.setTitle("马洪升专用测试用例化妆品");
        productDetailVOTest.setViceCatName("粉底");
        Assert.assertEquals(productDetailVOTest, productDetailVO);
    }
}
