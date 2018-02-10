package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Category;
import com.alan.hysupermarket.pojo.CategoryExample;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}