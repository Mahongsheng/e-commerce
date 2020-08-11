package com.ecommerce.service.impl;

import com.ecommerce.service.UploadImageService;
import com.ecommerce.util.OssServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class UploadImageServiceImpl implements UploadImageService {

    @Autowired
    private OssServiceImpl ossService;

    @Override
    public String uploadImages(MultipartFile file) {
        try {
            if (file == null || file.getSize() <= 0) {
                throw new Exception("某一图片为空");
            }
            String name = ossService.uploadHomeImageOSS(file);
            String imgUrl = ossService.getHomeImageUrl(name);
            System.out.println(name + "  " + imgUrl);
            return imgUrl;

//            for (MultipartFile file : files) {
//                if (file == null || file.getSize() <= 0) {
//                    throw new Exception("某一图片为空");
//                }
//                String name = ossClient.uploadHomeImageOSS(file);
//                String imgUrl = ossClient.getHomeImageUrl(name);
//                System.out.println(name + "  " + imgUrl);
//                imgUrls.add(imgUrl);
//            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
