package com.ecommerce.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UploadImageService {
    String uploadImages(MultipartFile file);
}
