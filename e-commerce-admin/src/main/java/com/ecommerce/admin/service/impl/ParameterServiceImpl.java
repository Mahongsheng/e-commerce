package com.ecommerce.admin.service.impl;

import com.ecommerce.admin.service.ParameterService;
import com.ecommerce.admin.vojo.*;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.ParParameterMapper;
import com.ecommerce.mybatis.pojo.ParParameter;
import com.ecommerce.mybatis.pojo.ParParameterExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yousabla
 */
@Service
public class ParameterServiceImpl implements ParameterService {

    @Resource
    ParParameterMapper parParameterMapper;

    @Override
    public boolean add(AddParameterVO addParameterVO){
        ParParameter parParameter = new ParParameter();
        parParameter.setDescription(addParameterVO.getDescription());
        parParameter.setCreatedBy(addParameterVO.getUserId());
        parParameter.setCreationDate(new Date());
        parParameter.setParamCd(addParameterVO.getParCd());
        parParameter.setParamValue(addParameterVO.getParValue());
        return parParameterMapper.insertSelective(parParameter) == 1;
    }

    private List<ParInfoVO> convert(Page<ParParameter> flowPage){
        List<ParInfoVO> infos = new ArrayList<>();
        for (ParParameter parParameter:flowPage.getResult()) {
            ParInfoVO parInfoVO = new ParInfoVO();
            parInfoVO.setDescription(parParameter.getDescription());
            parInfoVO.setParCd(parParameter.getParamCd());
            parInfoVO.setParId(parParameter.getParId());
            parInfoVO.setParValue(parParameter.getParamValue());
            infos.add(parInfoVO);
        }
        return infos;
    }

    @Override
    public CommonPage<ParInfoVO> getAllParInfo(PageVO pageVO) {
        Page<ParParameter> flowPage = PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize()).doSelectPage(() -> {
            ParParameterExample example = new ParParameterExample();
            parParameterMapper.selectByExample(example);
        });
        return CommonPage.restPage(convert(flowPage),flowPage);
    }

    @Override
    public CommonPage<ParInfoVO> searchPar(SearchParVO searchParVO) {
        Page<ParParameter> flowPage = PageHelper.startPage(searchParVO.getPageNum(), searchParVO.getPageSize()).doSelectPage(() -> {
            ParParameterExample example = new ParParameterExample();
            example.createCriteria().andParamCdLike("%" + searchParVO.getParCd() + "%");
            parParameterMapper.selectByExample(example);
        });
        return CommonPage.restPage(convert(flowPage),flowPage);
    }

    @Override
    public ParInfoVO getParWhenUpdate(Integer parId){
        ParParameter parameter = parParameterMapper.selectByPrimaryKey(parId);
        if (parameter == null) {
            return null;
        }
        ParInfoVO parInfoVO = new ParInfoVO();
        parInfoVO.setParId(parameter.getParId());
        parInfoVO.setParValue(parameter.getParamValue());
        parInfoVO.setParCd(parameter.getParamCd());
        parInfoVO.setDescription(parameter.getDescription());
        return parInfoVO;
    }

    @Override
    public Boolean updatePar(UpdateParVO updateParVO){
        ParParameter parameter = parParameterMapper.selectByPrimaryKey(updateParVO.getParId());
        if (parameter == null) {
            return false;
        }
        parameter.setParamCd(updateParVO.getParCd());
        parameter.setParamValue(updateParVO.getParValue());
        parameter.setLastUpdateBy(updateParVO.getUserId());
        parameter.setDescription(updateParVO.getDescription());
        parameter.setLastUpdateDate(new Date());
        return parParameterMapper.updateByPrimaryKeySelective(parameter) >= 0;
    }

    @Override
    public Boolean deletePar(Integer parId){
        return parParameterMapper.deleteByPrimaryKey(parId) >= 0;
    }

    @Override
    public Boolean batchDeletePar(List<Integer> parIds){
        ParParameterExample example = new ParParameterExample();
        example.createCriteria().andParIdIn(parIds);
        return parParameterMapper.deleteByExample(example) == parIds.size();
    }
}
