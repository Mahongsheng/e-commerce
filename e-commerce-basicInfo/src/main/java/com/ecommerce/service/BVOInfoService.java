package com.ecommerce.service;

import com.ecommerce.vojo.bvoinfo.*;

public interface BVOInfoService {
    BVOEntryVO getBVO(GetBVOVO getBVOVO);

    boolean initBVOInfo(BVOInfoInitVO bvoInfoInitVO);

    boolean updateBVOInfo(BVOInfoUpdateVO bvoInfoUpdateVO);

}
