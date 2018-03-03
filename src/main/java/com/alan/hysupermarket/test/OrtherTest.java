package com.alan.hysupermarket.test;

import com.alan.hysupermarket.mapper.CategoryMapper;
import com.alan.hysupermarket.pojo.Category;
import com.alan.hysupermarket.pojo.CategoryExample;

import java.util.List;

public class OrtherTest {

    public static void main(String[] args) {
        CategoryMapper categoryMapper = null;
       // CategoryExample example = new CategoryExample();
//        example.setOrderByClause("id desc");
//
//        List<Category> categories = categoryMapper.selectByExample(example);
//
//        for (Category category:categories) {
//            System.out.println(category.getNAME=());
//        }

        Category category = categoryMapper.selectByPrimaryKey(60L);

        System.out.println(category.getNAME());
    }

}
