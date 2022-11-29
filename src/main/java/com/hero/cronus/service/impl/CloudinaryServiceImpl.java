package com.hero.cronus.service.impl;

import com.cloudinary.Cloudinary;
import com.hero.cronus.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryServiceImpl implements CloudinaryService {

    @Autowired
    private Cloudinary cloudinaryConfig;

    @Override
    public String uploadFile(MultipartFile file) {
        return null;
    }

    @Override
    public String getFile(String fileName) {
        return null;
    }
}
