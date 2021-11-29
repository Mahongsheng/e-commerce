package com.ecommerce.basicInfo.service;

import com.ecommerce.basicInfo.vojo.bvoinfo.BVOEntryVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoInitVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.GetBVOVO;

public interface BVOInfoService {
    BVOEntryVO getBVO(GetBVOVO getBVOVO);

    boolean initBVOInfo(BVOInfoInitVO bvoInfoInitVO);

    boolean updateBVOInfo(BVOInfoUpdateVO bvoInfoUpdateVO);

}
