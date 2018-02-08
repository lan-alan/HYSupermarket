package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Category;
import com.alan.hysupermarket.pojo.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    void delete(long id);

    void update(Product product);

    Product get(long id);

    List<Product> list(long cid);

    void setFirstProductImage(Product p);

    void fill(List<Category> categories);

    void fill(Category category);

    void fillByRow(List<Category> categories);

    void setSaleAndReviewNumber(Product product);

    void setSaleAndReviewNumber(List<Product> products);

    List<Product> search(String keyword);
}
