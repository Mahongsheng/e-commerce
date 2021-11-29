package com.ecommerce.product.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadImageService {
    String uploadImages(MultipartFile file);
}
