package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.ProductImage;

import java.util.List;

public interface IProductImageService {

    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage productImage);

    void delete(long id);

    void update(ProductImage productImage);

    ProductImage get(long id);

    List<ProductImage> list(long pid, String type);

}
