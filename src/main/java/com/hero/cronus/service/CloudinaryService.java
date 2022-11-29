package com.hero.cronus.service;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {
    String uploadFile(MultipartFile file);
    String getFile(String fileName);
}
