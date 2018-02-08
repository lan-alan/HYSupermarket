package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.IProductMapper;
import com.alan.hysupermarket.pojo.Category;
import com.alan.hysupermarket.pojo.Product;
import com.alan.hysupermarket.pojo.ProductExample;
import com.alan.hysupermarket.pojo.ProductImage;
import com.alan.hysupermarket.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper productMapper;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IProductImageService productImageService;

    @Autowired
    private IOrderItemService orderItemService;

    @Autowired
    private IReviewService reviewService;

    @Override
    public void add(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void delete(long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public Product get(long id) {
        Product product = productMapper.selectByPrimaryKey(id);
        setFirstProductImage(product);
        setCategory(product);
        return product;
    }

    public void setCategory(List<Product> products) {
        for (Product product : products)
            setCategory(product);
    }

    public void setCategory(Product product) {
        long cid = product.getCID();
        Category c = categoryService.get(cid);
        product.setCategory(c);
    }

    @Override
    public List<Product> list(long cid) {
        ProductExample example = new ProductExample();
        example.createCriteria().andCIDEqualTo(cid);
        example.setOrderByClause("id desc");
        List<Product> products = productMapper.selectByExample(example);
        setFirstProductImage(products);
        setCategory(products);
        return products;
    }

    @Override
    public void setFirstProductImage(Product product) {
        List<ProductImage> pis = productImageService.list(product.getID(), IProductImageService.type_single);
        if (!pis.isEmpty()) {
            ProductImage pi = pis.get(0);
            product.setFirstProductImage(pi);
        }
    }

    @Override
    public void fill(List<Category> categories) {
        for (Category category : categories) {
            fill(category);
        }
    }

    @Override
    public void fill(Category category) {
        List<Product> products = list(category.getID());
        category.setProducts(products);
    }

    @Override
    public void fillByRow(List<Category> categories) {
        int productNumberEachRow = 8;
        for (Category category : categories) {
            List<Product> products = category.getProducts();
            List<List<Product>> productsByRow = new ArrayList<>();
            for (int i = 0; i < products.size(); i += productNumberEachRow) {
                int size = i + productNumberEachRow;
                size = size > products.size() ? products.size() : size;
                List<Product> productsOfEachRow = products.subList(i, size);
                productsByRow.add(productsOfEachRow);
            }
            category.setProductsByRow(productsByRow);
        }
    }

    @Override
    public void setSaleAndReviewNumber(Product product) {
        int saleCount = orderItemService.getSaleCount(product.getID());
        product.setSaleCount(saleCount);

        int reviewCount = reviewService.getCount(product.getID());
        product.setReviewCount(reviewCount);
    }

    @Override
    public void setSaleAndReviewNumber(List<Product> products) {
        for (Product product : products) {
            setSaleAndReviewNumber(product);
        }
    }

    @Override
    public List<Product> search(String keyword) {
        ProductExample example = new ProductExample();
        example.createCriteria().andNAMELike("%" + keyword + "%");
        example.setOrderByClause("id desc");
        List<Product> products = productMapper.selectByExample(example);
        setFirstProductImage(products);
        setCategory(products);
        return products;
    }

    public void setFirstProductImage(List<Product> products) {
        for (Product product : products) {
            setFirstProductImage(product);
        }
    }
}
