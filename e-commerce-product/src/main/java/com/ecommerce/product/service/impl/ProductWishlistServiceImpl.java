package com.ecommerce.product.service.impl;

import com.ecommerce.mybatis.dao.WitWishlistMapper;
import com.ecommerce.mybatis.dto.product.wishlist.ProductCatsDTO;
import com.ecommerce.mybatis.dto.product.wishlist.ProductWishlistDTO;
import com.ecommerce.mybatis.pojo.WitWishlistExample;
import com.ecommerce.product.service.ProductWishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductWishlistServiceImpl implements ProductWishlistService {

    @Autowired
    private WitWishlistMapper witWishlistMapper;

    @Override
    public List<ProductCatsDTO> getAllCatFromWishlist(Integer dsrId) {
        return witWishlistMapper.getAllCatFromWishlist(dsrId);
    }

    @Override
    public List<ProductWishlistDTO> getWishlistByIdAndCat(Integer dsrId, Integer catId) {
        List<ProductWishlistDTO> result;
        if (catId != null) {
            result = witWishlistMapper.getWishlistByIdAndCat(dsrId, catId);
        } else {
            result = witWishlistMapper.getWishlistByIdNoCat(dsrId);
        }
        return result;
    }

    @Override
    public boolean deleteProFromWit(Integer dsrId, Integer proId) {
        WitWishlistExample witWishlistExample = new WitWishlistExample();
        WitWishlistExample.Criteria criteria = witWishlistExample.createCriteria();
        criteria.andDsrIdEqualTo(dsrId);
        criteria.andProIdEqualTo(proId);

        int result = witWishlistMapper.deleteByExample(witWishlistExample);
        return result == 1;
    }

    @Override
    public boolean batchDeleteProFromWit(Integer dsrId, List<Integer> proIds) {
        int result = witWishlistMapper.batchDeleteWishlist(dsrId, proIds);
        return result == 1;
    }

}
