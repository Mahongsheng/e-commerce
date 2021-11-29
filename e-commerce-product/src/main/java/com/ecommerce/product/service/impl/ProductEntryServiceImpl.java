package com.ecommerce.product.service.impl;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.PckPackageInfoMapper;
import com.ecommerce.mybatis.dao.PdnProductDescriptionMapper;
import com.ecommerce.mybatis.dao.ProProductMapper;
import com.ecommerce.mybatis.pojo.*;
import com.ecommerce.product.service.ProductEntryService;
import com.ecommerce.product.vojo.entry.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductEntryServiceImpl implements ProductEntryService {

    @Autowired
    private ProProductMapper proProductMapper;

    @Autowired
    private PckPackageInfoMapper pckPackageInfoMapper;

    @Autowired
    private PdnProductDescriptionMapper pdnProductDescriptionMapper;

    @Override
    public CommonPage<ProductEntryVO> getAllProduct(GetAllProductVO vo) {
        Page<ProProduct> productPage = PageHelper.startPage(vo.getPageNum(), vo.getPageSize()).doSelectPage(() -> {
            ProProductExample proProductExample = new ProProductExample();
            ProProductExample.Criteria criteria = proProductExample.createCriteria();
            criteria.andManIdEqualTo(vo.getManId());
            proProductMapper.selectByExample(proProductExample);
        });

        List<ProductEntryVO> result = new ArrayList<>();
        for (ProProduct product : productPage.getResult()) {
            ProductEntryVO productEntryVO = new ProductEntryVO();
            productEntryVO.setProId(product.getProId());
            productEntryVO.setRetailPrice(String.valueOf(product.getRetailPrice()));
            productEntryVO.setSkuCd(product.getSkuCd());
            productEntryVO.setTitle(product.getTitle());
            productEntryVO.setWarNum("1000");
            result.add(productEntryVO);
        }
        return CommonPage.restPage(result, productPage);
    }

    @Override
    public CommonPage<ProductEntryVO> searchProductByTitle(SearchProductVO vo) {
        Page<ProProduct> productPage = PageHelper.startPage(vo.getPageNum(), vo.getPageSize()).doSelectPage(() -> {
            ProProductExample proProductExample = new ProProductExample();
            ProProductExample.Criteria criteria = proProductExample.createCriteria();
            criteria.andTitleLike("%" + vo.getTitle() + "%");
            criteria.andManIdEqualTo(vo.getManId());
            proProductMapper.selectByExample(proProductExample);
        });

        List<ProductEntryVO> result = new ArrayList<>();
        for (ProProduct product : productPage.getResult()) {
            ProductEntryVO productEntryVO = new ProductEntryVO();
            productEntryVO.setProId(product.getProId());
            productEntryVO.setRetailPrice(String.valueOf(product.getRetailPrice()));
            productEntryVO.setSkuCd(product.getSkuCd());
            productEntryVO.setTitle(product.getTitle());
            productEntryVO.setWarNum("1000");
            result.add(productEntryVO);
        }
        return CommonPage.restPage(result, productPage);
    }

    @Override
    public boolean addProductInfo(ProductAddVO vo) {
        ProProduct proProduct = new ProProduct();
        proProduct.setManId(vo.getManId());
        proProduct.setTitle(vo.getTitle());
        proProduct.setSkuCd(vo.getSkuCd());
        proProduct.setUpc(vo.getUpc());
        proProduct.setEan(vo.getEan());
        proProduct.setModel(vo.getModel());
        proProduct.setRetailPrice(new BigDecimal(vo.getRetailPrice()));
        proProduct.setWarrantyDay(vo.getWarrantyDay());
        proProduct.setCreatedBy(vo.getUserId());
        proProduct.setCreationDate(new Date());
        proProduct.setStsCd("a");
        proProductMapper.insertSelective(proProduct);

        // 更新重量等信息
        PckPackageInfo pckPackageInfo = new PckPackageInfo();
        pckPackageInfo.setProId(proProduct.getProId());
        pckPackageInfo.setLength(new BigDecimal(vo.getLength()));
        pckPackageInfo.setWidth(new BigDecimal(vo.getWeight()));
        pckPackageInfo.setHeight(new BigDecimal(vo.getHeight()));
        pckPackageInfo.setWeight(new BigDecimal(vo.getWeight()));
        pckPackageInfo.setCreatedBy(vo.getUserId());
        pckPackageInfo.setCreationDate(new Date());
        pckPackageInfoMapper.insertSelective(pckPackageInfo);

        PdnProductDescription amazonDes = new PdnProductDescription();
        amazonDes.setProId(proProduct.getProId());
        amazonDes.setTypeCd("RICH_TEXT");
        amazonDes.setCreatedBy(vo.getUserId());
        amazonDes.setCreationDate(new Date());
        amazonDes.setStsCd("1");
        amazonDes.setPlatformType("1");
        amazonDes.setDescrition(vo.getAmazonDescription());
        pdnProductDescriptionMapper.insertSelective(amazonDes);

        PdnProductDescription ebayDes = new PdnProductDescription();
        ebayDes.setProId(proProduct.getProId());
        ebayDes.setTypeCd("RICH_TEXT");
        ebayDes.setCreatedBy(vo.getUserId());
        ebayDes.setCreationDate(new Date());
        ebayDes.setStsCd("1");
        ebayDes.setPlatformType("2");
        ebayDes.setDescrition(vo.getEbayDescription());
        pdnProductDescriptionMapper.insertSelective(ebayDes);

        return true;
    }

    @Override
    public ProductAddVO getProductInfoWhenUpdate(Integer proId) {
        ProProduct proProduct = proProductMapper.selectByPrimaryKey(proId);
        ProductAddVO productAddVO = new ProductAddVO();
        productAddVO.setTitle(proProduct.getTitle());
        productAddVO.setSkuCd(proProduct.getSkuCd());
        productAddVO.setUpc(proProduct.getUpc());
        productAddVO.setEan(proProduct.getEan());
        productAddVO.setModel(proProduct.getModel());
        productAddVO.setRetailPrice(String.valueOf(proProduct.getRetailPrice()));
        productAddVO.setWarrantyDay(proProduct.getWarrantyDay());

        PckPackageInfoExample pckPackageInfoExample = new PckPackageInfoExample();
        PckPackageInfoExample.Criteria criteria_pck = pckPackageInfoExample.createCriteria();
        criteria_pck.andProIdEqualTo(proId);

        List<PckPackageInfo> pckPackageInfos = pckPackageInfoMapper.selectByExample(pckPackageInfoExample);
        PckPackageInfo pckPackageInfo = pckPackageInfos.get(0);
        productAddVO.setWidth(pckPackageInfo.getWidth().toString());
        productAddVO.setHeight(pckPackageInfo.getHeight().toString());
        productAddVO.setLength(pckPackageInfo.getLength().toString());
        productAddVO.setWeight(pckPackageInfo.getWeight().toString());

        PdnProductDescriptionExample pdnProductDescriptionExample = new PdnProductDescriptionExample();
        PdnProductDescriptionExample.Criteria criteria = pdnProductDescriptionExample.createCriteria();
        criteria.andProIdEqualTo(proId);

        List<PdnProductDescription> pdnProductDescriptions = pdnProductDescriptionMapper.selectByExampleWithBLOBs(pdnProductDescriptionExample);
        for (PdnProductDescription pdn : pdnProductDescriptions) {
            System.out.println(pdn.toString());
            if (pdn.getPlatformType().equals("1")) {
                productAddVO.setAmazonDescription(pdn.getDescrition());
            } else {
                productAddVO.setEbayDescription(pdn.getDescrition());
            }
        }

        return productAddVO;
    }

    @Override
    public boolean updateProductInfo(ProductUpdateVO vo) {
        // 更新商品信息
        ProProductExample proProductExample = new ProProductExample();
        ProProductExample.Criteria criteria_pro = proProductExample.createCriteria();
        criteria_pro.andProIdEqualTo(vo.getProId());
        ProProduct proProduct = new ProProduct();
        proProduct.setTitle(vo.getTitle());
        proProduct.setSkuCd(vo.getSkuCd());
        proProduct.setUpc(vo.getUpc());
        proProduct.setEan(vo.getEan());
        proProduct.setModel(vo.getModel());
        proProduct.setRetailPrice(new BigDecimal(vo.getRetailPrice()));
        proProduct.setWarrantyDay(vo.getWarrantyDay());
        proProduct.setLastUpdateBy(vo.getUserId());
        proProduct.setLastUpdateDate(new Date());
        proProductMapper.updateByExampleSelective(proProduct, proProductExample);

        // 更新重量等信息
        PckPackageInfoExample pckPackageInfoExample = new PckPackageInfoExample();
        PckPackageInfoExample.Criteria criteria_pck = pckPackageInfoExample.createCriteria();
        criteria_pck.andProIdEqualTo(vo.getProId());
        PckPackageInfo pckPackageInfo = new PckPackageInfo();
        pckPackageInfo.setLength(new BigDecimal(vo.getLength()));
        pckPackageInfo.setWidth(new BigDecimal(vo.getWeight()));
        pckPackageInfo.setHeight(new BigDecimal(vo.getHeight()));
        pckPackageInfo.setWeight(new BigDecimal(vo.getWeight()));
        pckPackageInfo.setLastUpdateBy(vo.getUserId());
        pckPackageInfo.setLastUpdeteDate(new Date());
        pckPackageInfoMapper.updateByExampleSelective(pckPackageInfo, pckPackageInfoExample);

        // 更新描述信息
        PdnProductDescription pdnProductDescription = new PdnProductDescription();
        pdnProductDescription.setTypeCd("RICH_TEXT");
        pdnProductDescription.setLastUpdateBy(vo.getUserId());
        pdnProductDescription.setLastUpdateDate(new Date());

        PdnProductDescriptionExample amazonExample = new PdnProductDescriptionExample();
        PdnProductDescriptionExample.Criteria criteria_amazon = amazonExample.createCriteria();
        criteria_amazon.andProIdEqualTo(vo.getProId());
        criteria_amazon.andPlatformTypeEqualTo("1");
        pdnProductDescription.setDescrition(vo.getAmazonDescription());
        pdnProductDescriptionMapper.updateByExampleSelective(pdnProductDescription, amazonExample);

        PdnProductDescriptionExample eBayExample = new PdnProductDescriptionExample();
        PdnProductDescriptionExample.Criteria criteria_eBay = eBayExample.createCriteria();
        criteria_eBay.andProIdEqualTo(vo.getProId());
        criteria_eBay.andPlatformTypeEqualTo("2");
        pdnProductDescription.setDescrition(vo.getEBayDescription());
        pdnProductDescriptionMapper.updateByExampleSelective(pdnProductDescription, eBayExample);

        return true;
    }

    @Override
    public boolean deleteProductInfo(Integer proId) {
        proProductMapper.deleteByPrimaryKey(proId);

        PckPackageInfoExample pckPackageInfoExample = new PckPackageInfoExample();
        PckPackageInfoExample.Criteria criteria = pckPackageInfoExample.createCriteria();
        criteria.andProIdEqualTo(proId);
        pckPackageInfoMapper.deleteByExample(pckPackageInfoExample);
        return true;
    }

    @Override
    public boolean batchDeleteProductInfo(List<Integer> proIds) {
        for (int proId : proIds) {
            proProductMapper.deleteByPrimaryKey(proId);
        }
        return true;
    }
}
