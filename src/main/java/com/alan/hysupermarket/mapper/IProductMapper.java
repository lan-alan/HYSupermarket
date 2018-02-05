package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Product;
import com.alan.hysupermarket.pojo.ProductExample;
import java.util.List;

public interface IProductMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}