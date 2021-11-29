package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.Sequence;
import com.ecommerce.mybatis.pojo.SequenceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {
    long countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);
}