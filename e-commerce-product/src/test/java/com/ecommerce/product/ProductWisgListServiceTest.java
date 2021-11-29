package com.ecommerce.product;

import com.ecommerce.mybatis.dto.product.wishlist.ProductCatsDTO;
import com.ecommerce.mybatis.dto.product.wishlist.ProductWishlistDTO;
import com.ecommerce.product.service.ProductWishlistService;
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
 * @ClassName: ProductWisgListServiceTest
 * @Description: 测试类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/16 15:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProductApplication.class})
public class ProductWisgListServiceTest {
    @Autowired
    private ProductWishlistService productWishlistService;

    @Test
    public void testGetAllCatFromWishlist(){
        List<ProductCatsDTO> productCatsDTOS = productWishlistService.getAllCatFromWishlist(1);
        Assert.assertEquals(1,(long)productCatsDTOS.get(0).getCatId());
    }

    @Test
    public void testGetWishlistByIdAndCat(){
        List<ProductWishlistDTO> productWishlistDTOS = productWishlistService.getWishlistByIdAndCat(1,1);
        Assert.assertEquals("https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1593771713868.png",
                productWishlistDTOS.get(0).getImage());
        Assert.assertEquals("https://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/m-img/item-detail-1.jpg",
                productWishlistDTOS.get(1).getImage());
    }
}
