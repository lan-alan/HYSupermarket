package com.alan.hysupermarket.utils;

import org.springframework.web.multipart.MultipartFile;

/**
 * 上传照片文件工具类
 */
public class UploadedImageFile {

    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}
