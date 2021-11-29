package com.ecommerce.product.service.impl;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.CatCategoryMapper;
import com.ecommerce.mybatis.dao.ImgImageMapper;
import com.ecommerce.mybatis.dao.PrcProductCategoryMapper;
import com.ecommerce.mybatis.dao.ProProductMapper;
import com.ecommerce.mybatis.dto.product.OssCallbackResult;
import com.ecommerce.mybatis.pojo.*;
import com.ecommerce.product.service.ProductImageService;
import com.ecommerce.product.vojo.image.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductImageServiceImpl implements ProductImageService {

    @Autowired
    private ProProductMapper proProductMapper;

    @Autowired
    private ImgImageMapper imgImageMapper;

    @Autowired
    private PrcProductCategoryMapper prcProductCategoryMapper;

    @Autowired
    private CatCategoryMapper catCategoryMapper;

    @Override
    public CommonPage<ProductImageVO> getAllProductImage(GetAllProductImageVO vo) {
        Page<ProProduct> productPage = PageHelper.startPage(vo.getPageNum(), vo.getPageSize()).doSelectPage(() -> {
            ProProductExample proProductExample = new ProProductExample();
            ProProductExample.Criteria criteria = proProductExample.createCriteria();
            criteria.andManIdEqualTo(vo.getManId());
            proProductMapper.selectByExample(proProductExample);
        });

        // 需要从分类表中找到分类；需要从图片表中找到主URI
        List<ProductImageVO> result = new ArrayList<>();
        for (ProProduct product : productPage.getResult()) {
            ProductImageVO productImageVO = new ProductImageVO();
            productImageVO.setProId(product.getProId());
            productImageVO.setTitle(product.getTitle());
            String statusChar = product.getStsCd();
            if (statusChar.equals("a")) {
                statusChar = "待入仓";
            } else if (statusChar.equals("b")) {
                statusChar = "入仓中";
            } else if (statusChar.equals("c")) {
                statusChar = "待上架";
            } else {
                statusChar = "上架中";
            }
            productImageVO.setStatus(statusChar);

            PrcProductCategory prcProductCategory = prcProductCategoryMapper.selectByPrimaryKey(product.getPrcId());
            if (prcProductCategory != null)
                productImageVO.setCategoryName(prcProductCategory.getCategoryPath());

            ImgImageExample imgImageExample = new ImgImageExample();
            ImgImageExample.Criteria criteria_img = imgImageExample.createCriteria();
            criteria_img.andEntityIdEqualTo(String.valueOf(product.getProId()));
            criteria_img.andSeqNoEqualTo(1);
            criteria_img.andStsCdEqualTo("1");
            List<ImgImage> imgImages = imgImageMapper.selectByExample(imgImageExample);
            if (!imgImages.isEmpty())
                productImageVO.setImageUri(imgImages.get(0).getUri());

            result.add(productImageVO);
        }
        return CommonPage.restPage(result, productPage);
    }

    @Override
    public CommonPage<ProductImageVO> searchProductImageByTitle(SearchProductImageVO vo) {
        Page<ProProduct> productPage = PageHelper.startPage(vo.getPageNum(), vo.getPageSize()).doSelectPage(() -> {
            ProProductExample proProductExample = new ProProductExample();
            ProProductExample.Criteria criteria = proProductExample.createCriteria();
            criteria.andTitleLike("%" + vo.getTitle() + "%");
            criteria.andManIdEqualTo(vo.getManId());
            proProductMapper.selectByExample(proProductExample);
        });

        // 需要从分类表中找到分类；需要从图片表中找到主URI
        List<ProductImageVO> result = new ArrayList<>();
        for (ProProduct product : productPage.getResult()) {
            ProductImageVO productImageVO = new ProductImageVO();
            productImageVO.setProId(product.getProId());
            productImageVO.setTitle(product.getTitle());
            String statusChar = product.getStsCd();
            if (statusChar.equals("a")) {
                statusChar = "待入仓";
            } else if (statusChar.equals("b")) {
                statusChar = "入仓中";
            } else if (statusChar.equals("c")) {
                statusChar = "待上架";
            } else {
                statusChar = "上架中";
            }
            productImageVO.setStatus(statusChar);

            PrcProductCategory prcProductCategory = prcProductCategoryMapper.selectByPrimaryKey(product.getPrcId());
            if (prcProductCategory != null)
                productImageVO.setCategoryName(prcProductCategory.getCategoryName());

            ImgImageExample imgImageExample = new ImgImageExample();
            ImgImageExample.Criteria criteria_img = imgImageExample.createCriteria();
            criteria_img.andEntityIdEqualTo(String.valueOf(product.getProId()));
            criteria_img.andSeqNoEqualTo(1);
            criteria_img.andStsCdEqualTo("1");
            List<ImgImage> imgImages = imgImageMapper.selectByExample(imgImageExample);
            if (!imgImages.isEmpty())
                productImageVO.setImageUri(imgImages.get(0).getUri());

            result.add(productImageVO);
        }
        return CommonPage.restPage(result, productPage);
    }

    @Override
    public boolean addProductCategory(ProductCategoryAddVO vo) {
        int mainCatId = vo.getCategory().get(0);
        int viceCatId = vo.getCategory().get(1);
        // 首先插入分类
        CatCategory mainCatCategory = catCategoryMapper.selectByPrimaryKey(mainCatId);
        CatCategory viceCatCategory = catCategoryMapper.selectByPrimaryKey(viceCatId);

        PrcProductCategory prcProductCategory = new PrcProductCategory();
        prcProductCategory.setProId(vo.getProId());
        prcProductCategory.setCategoryId(mainCatId);
        prcProductCategory.setCategoryName(mainCatCategory.getCatName());
        prcProductCategory.setCategoryPath(mainCatCategory.getCatName() + "/" + viceCatCategory.getCatName());
        prcProductCategory.setCreatedBy(vo.getUserId());
        prcProductCategory.setCreationDate(new Date());
        prcProductCategory.setLastUpdateBy(vo.getUserId());
        prcProductCategory.setLastUpdateDate(new Date());

        prcProductCategoryMapper.insertSelective(prcProductCategory);

        ProProduct proProduct = new ProProduct();
        proProduct.setProId(vo.getProId());
        proProduct.setPrcId(prcProductCategory.getPrcId());

        prcProductCategory.setCategoryId(viceCatId);
        prcProductCategory.setCategoryName(viceCatCategory.getCatName());
        prcProductCategoryMapper.insertSelective(prcProductCategory);

        // 之后更新商品表
        proProductMapper.updateByPrimaryKeySelective(proProduct);

        // 最后插入图片
        int seqNo = 1;
        for (OssCallbackResult image : vo.getImages()) {
            ImgImage imgImage = new ImgImage();
            String[] imageName = image.getFilename().split("/");
            String name = imageName[imageName.length - 1];
            imgImage.setName(name);
            imgImage.setWidth(Integer.parseInt(image.getWidth()));
            imgImage.setHeight(Integer.parseInt(image.getHeight()));
            imgImage.setUri(image.getFilename());
//            imgImage.setTypeCd();
            imgImage.setEntityId(String.valueOf(vo.getProId()));
            imgImage.setEntityCd("PM");
            imgImage.setSeqNo(seqNo);
            imgImage.setCreatedBy(vo.getUserId());
            imgImage.setCreationDate(new Date());
            imgImage.setStsCd("1");
            imgImageMapper.insertSelective(imgImage);
            seqNo++;
        }
        return true;
    }

    @Override
    public boolean changeProStatus(ProductStatusVO vo) {
        String status = vo.getStatus();
        String statusChar = "";
        if (status.equals("待入仓")) {
            statusChar = "b";
        } else if (status.equals("待上架")) {
            statusChar = "d";
        } else if (status.equals("上架中")) {
            statusChar = "c";
        } else {
            statusChar = "b";
        }
        ProProduct proProduct = new ProProduct();
        proProduct.setProId(vo.getProId());
        proProduct.setStsCd(statusChar);

        return proProductMapper.updateByPrimaryKeySelective(proProduct) == 1;

    }

    @Override
    public ProductCategoryAddVO getProductCatWhenUpdate(Integer proId) {
        ProductCategoryAddVO productCategoryAddVO = new ProductCategoryAddVO();
        productCategoryAddVO.setProId(proId);


        return null;
    }

    @Override
    public boolean updateProductImage(ProductCategoryUpdateVO vo) {
        PrcProductCategoryExample prcProductCategoryExample = new PrcProductCategoryExample();
        PrcProductCategoryExample.Criteria criteria = prcProductCategoryExample.createCriteria();
        criteria.andProIdEqualTo(vo.getProId());

        prcProductCategoryMapper.deleteByExample(prcProductCategoryExample);

        int mainCatId = vo.getCategory().get(0);
        int viceCatId = vo.getCategory().get(1);

        CatCategory mainCatCategory = catCategoryMapper.selectByPrimaryKey(mainCatId);
        CatCategory viceCatCategory = catCategoryMapper.selectByPrimaryKey(viceCatId);

        PrcProductCategory prcProductCategory = new PrcProductCategory();
        prcProductCategory.setProId(vo.getProId());
        prcProductCategory.setCategoryId(mainCatId);
        prcProductCategory.setCategoryName(mainCatCategory.getCatName());
        prcProductCategory.setCategoryPath(mainCatCategory.getCatName() + "/" + viceCatCategory.getCatName());
        prcProductCategory.setCreatedBy(vo.getUserId());
        prcProductCategory.setCreationDate(new Date());
        prcProductCategory.setLastUpdateBy(vo.getUserId());
        prcProductCategory.setLastUpdateDate(new Date());

        prcProductCategoryMapper.insertSelective(prcProductCategory);

        ProProduct proProduct = new ProProduct();
        proProduct.setProId(vo.getProId());
        proProduct.setPrcId(prcProductCategory.getPrcId());

        prcProductCategory.setCategoryId(viceCatId);
        prcProductCategory.setCategoryName(viceCatCategory.getCatName());
        prcProductCategoryMapper.insertSelective(prcProductCategory);

        proProductMapper.updateByPrimaryKeySelective(proProduct);

        ImgImageExample imgImageExample = new ImgImageExample();
        imgImageExample.createCriteria().andEntityIdEqualTo(String.valueOf(vo.getProId()));
        long imgCount = imgImageMapper.countByExample(imgImageExample);
        // 最后插入图片
        int seqNo = 1;
        for (int i = 0; i < vo.getImages().size(); i++) {
            OssCallbackResult image = vo.getImages().get(i);

            ImgImage imgImage = new ImgImage();
            String[] imageName = image.getFilename().split("/");
            String name = imageName[imageName.length - 1];
            imgImage.setName(name);
            imgImage.setWidth(Integer.parseInt(image.getWidth()));
            imgImage.setHeight(Integer.parseInt(image.getHeight()));
            imgImage.setUri(image.getFilename());
            imgImage.setSeqNo(seqNo);
            imgImage.setStsCd("1");
            if (seqNo <= imgCount) { // 更新数据库中存在的图片
                imgImage.setLastUpdateBy(vo.getUserId());
                imgImage.setLastUpdateDate(new Date());
                ImgImageExample example = new ImgImageExample();
                ImgImageExample.Criteria criteria_img = example.createCriteria();
                criteria_img.andEntityIdEqualTo(String.valueOf(vo.getProId()));
                criteria_img.andSeqNoEqualTo(seqNo);
                imgImageMapper.updateByExampleSelective(imgImage, example);
            } else { // 向数据库中添加更多的图片
                imgImage.setEntityId(String.valueOf(vo.getProId()));
                imgImage.setEntityCd("PM");
                imgImage.setCreatedBy(vo.getUserId());
                imgImage.setCreationDate(new Date());
                imgImageMapper.insertSelective(imgImage);
            }
            seqNo++;
        }

        // 设置多余图片的URL为失效状态
        for (; seqNo <= imgCount; seqNo++) {
            ImgImage imgImage = new ImgImage();
            imgImage.setStsCd("0");

            ImgImageExample example = new ImgImageExample();
            ImgImageExample.Criteria criteria_img = example.createCriteria();
            criteria_img.andEntityIdEqualTo(String.valueOf(vo.getProId()));
            criteria_img.andSeqNoEqualTo(seqNo);
            imgImageMapper.updateByExampleSelective(imgImage, example);
        }
        return true;
    }

    @Override
    public boolean deleteProductImage(List<Integer> proIds) {
        if (proIds.isEmpty()) {
            return false;
        }

        // 删除商品图片、分类
        List<String> stringProIds = new ArrayList<>();
        for (int pro_id : proIds) {
            stringProIds.add(String.valueOf(pro_id));
        }

        imgImageMapper.deleteProductImageByList(stringProIds);
        prcProductCategoryMapper.deleteProductCategoryByList(proIds);
        return true;
    }

    @Override
    public List<ProductCategoryVO> getAllCategory() {
        List<ProductCategoryVO> result = new ArrayList<>();
        CatCategoryExample catCategoryExample = new CatCategoryExample();
        CatCategoryExample.Criteria criteria_cat = catCategoryExample.createCriteria();
        criteria_cat.andCatFatherIdIsNull();

        List<CatCategory> mainCatCategories = catCategoryMapper.selectByExample(catCategoryExample);

        for (CatCategory cat : mainCatCategories) {
            ProductCategoryVO productCategoryVO = new ProductCategoryVO();
            productCategoryVO.setCatId(cat.getCatId());
            productCategoryVO.setCatName(cat.getCatName());
            List<ViceCategory> viceCats = productCategoryVO.getViceCats();

            CatCategoryExample viceCatCategoryExample = new CatCategoryExample();
            CatCategoryExample.Criteria criteria_vice_cat_ = viceCatCategoryExample.createCriteria();
            criteria_vice_cat_.andCatFatherIdEqualTo(cat.getCatId());

            List<CatCategory> viceCatCategories = catCategoryMapper.selectByExample(viceCatCategoryExample);

            if (!viceCatCategories.isEmpty()) {
                for (CatCategory viceCat : viceCatCategories) {
                    ViceCategory viceCategory = new ViceCategory();
                    viceCategory.setCatId(viceCat.getCatId());
                    viceCategory.setCatName(viceCat.getCatName());
                    viceCats.add(viceCategory);
                }
            }
            result.add(productCategoryVO);
        }
        return result;
    }

}
