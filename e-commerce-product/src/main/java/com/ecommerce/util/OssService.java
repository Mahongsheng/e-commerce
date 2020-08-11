package com.ecommerce.util;


import com.ecommerce.dto.product.OssCallbackResult;
import com.ecommerce.dto.product.OssPolicyResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by macro on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);

    String uploadHomeImageOSS(MultipartFile file) throws Exception;

    boolean deleteFile(String filePath);
}
