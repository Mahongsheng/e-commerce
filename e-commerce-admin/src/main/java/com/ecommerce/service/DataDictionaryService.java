package com.ecommerce.service;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.vojo.*;

import java.util.List;

/**
 * @author 90707
 */
public interface DataDictionaryService {
    boolean add(AddCdmVO addCdmVO);

    CommonPage<CdmInfoVO> getAllCdmInfo(PageVO pageVO);

    CommonPage<CdmInfoVO> searchCdm(SearchCdmVO searchCdmVO);

    CdmInfoVO getCdmWhenUpdate(Integer parId);

    Boolean updateCdm(UpdateCdmVO updateCdmVO);

    Boolean deleteCdm(Integer cdmId);

    Boolean batchDeleteCdm(List<Integer> cdmIds);
}
