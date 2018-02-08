package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> list();

    void add(Category category);

    void delete(long id);

    Category get(long id);

    void update(Category category);

}
