package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.ProductImageMapper;
import com.alan.hysupermarket.pojo.ProductImage;
import com.alan.hysupermarket.pojo.ProductImageExample;
import com.alan.hysupermarket.service.IProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageServiceImpl implements IProductImageService {

    @Autowired
    private ProductImageMapper productImageMapper;

    @Override
    public void add(ProductImage productImage) {
        productImageMapper.insert(productImage);
    }

    @Override
    public void delete(long id) {
        productImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ProductImage productImage) {
        productImageMapper.updateByPrimaryKeySelective(productImage);
    }

    @Override
    public ProductImage get(long id) {
        return productImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProductImage> list(long pid, String type) {
        ProductImageExample example = new ProductImageExample();
        example.createCriteria().andPIDEqualTo(pid).andTYPEEqualTo(type);
        example.setOrderByClause("id desc");
        return productImageMapper.selectByExample(example);
    }
}
