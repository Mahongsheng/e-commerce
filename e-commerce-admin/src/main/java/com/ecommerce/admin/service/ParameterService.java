package com.ecommerce.admin.service;

import com.ecommerce.admin.vojo.*;
import com.ecommerce.common.base.CommonPage;

import java.util.List;

/**
 * @author 90707
 */
public interface ParameterService {
    boolean add(AddParameterVO addParameterVO);

    CommonPage<ParInfoVO> getAllParInfo(PageVO pageVO);

    CommonPage<ParInfoVO> searchPar(SearchParVO searchParVO);

    ParInfoVO getParWhenUpdate(Integer parId);

    Boolean updatePar(UpdateParVO updateParVO);

    Boolean deletePar(Integer parId);

    Boolean batchDeletePar(List<Integer> parIds);
}
