package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.CategoryMapper;
import com.alan.hysupermarket.pojo.Category;
import com.alan.hysupermarket.pojo.CategoryExample;
import com.alan.hysupermarket.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void delete(long id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Category get(long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }
}
