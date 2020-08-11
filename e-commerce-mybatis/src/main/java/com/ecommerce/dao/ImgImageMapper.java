package com.ecommerce.dao;

import com.ecommerce.pojo.ImgImage;
import com.ecommerce.pojo.ImgImageExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgImageMapper {
    long countByExample(ImgImageExample example);

    int deleteByExample(ImgImageExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(ImgImage record);

    int insertSelective(ImgImage record);

    List<ImgImage> selectByExample(ImgImageExample example);

    ImgImage selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") ImgImage record, @Param("example") ImgImageExample example);

    int updateByExample(@Param("record") ImgImage record, @Param("example") ImgImageExample example);

    int updateByPrimaryKeySelective(ImgImage record);

    int updateByPrimaryKey(ImgImage record);

    int deleteProductImageByList(@Param("proIds") List<String> proIds);
}