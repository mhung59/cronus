package com.hero.cronus.service;

import java.io.File;
import java.io.IOException;

public interface CloudinaryService {
    String uploadFile(File file) throws IOException;
    String getFile(String fileName);
}
