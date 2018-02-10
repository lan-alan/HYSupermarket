package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.OrdersItemMapper;
import com.alan.hysupermarket.pojo.Orders;
import com.alan.hysupermarket.pojo.OrdersItem;
import com.alan.hysupermarket.pojo.OrdersItemExample;
import com.alan.hysupermarket.pojo.Product;
import com.alan.hysupermarket.service.IOrdersItemService;
import com.alan.hysupermarket.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersItemServiceImpl implements IOrdersItemService {

    @Autowired
    private OrdersItemMapper OrdersItemMapper;

    @Autowired
    private IProductService productService;

    @Override
    public void add(OrdersItem OrdersItem) {
        OrdersItemMapper.insert(OrdersItem);
    }

    @Override
    public void delete(long id) {
        OrdersItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(OrdersItem OrdersItem) {
        OrdersItemMapper.updateByPrimaryKeySelective(OrdersItem);
    }

    @Override
    public OrdersItem get(long id) {
        OrdersItem OrdersItem = OrdersItemMapper.selectByPrimaryKey(id);
        setProduct(OrdersItem);
        return OrdersItem;
    }

    @Override
    public List<OrdersItem> list() {
        OrdersItemExample example = new OrdersItemExample();
        example.setOrderByClause("id desc");
        return OrdersItemMapper.selectByExample(example);
    }

    @Override
    public void fill(List<Orders> Orderss) {
        for (Orders Orders : Orderss) {
            fill(Orders);
        }

    }

    @Override
    public void fill(Orders Orders) {
        OrdersItemExample example = new OrdersItemExample();
        example.createCriteria().andOIDEqualTo(Orders.getID());
        example.setOrderByClause("id desc");
        List<OrdersItem> ois = OrdersItemMapper.selectByExample(example);
        setProduct(ois);

        float total = 0;
        int totalNumber = 0;
        for (OrdersItem oi : ois) {
            total += oi.getQUANTITY() * oi.getProduct().getPROMOTEPRICE();
            totalNumber += oi.getQUANTITY();
        }
        Orders.setTotal(total);
        Orders.setTotalNumber(totalNumber);
        Orders.setOrderItems(ois);
    }

    @Override
    public int getSaleCount(long pid) {
        OrdersItemExample example = new OrdersItemExample();
        example.createCriteria().andPIDEqualTo(pid);
        List<OrdersItem> ois = OrdersItemMapper.selectByExample(example);
        int result = 0;
        for (OrdersItem oi : ois) {
            result += oi.getQUANTITY();
        }
        return result;
    }

    @Override
    public List<OrdersItem> listByUser(long uid) {
        OrdersItemExample example = new OrdersItemExample();
        example.createCriteria().andUUIDEqualTo(uid).andOIDIsNull();
        List<OrdersItem> result = OrdersItemMapper.selectByExample(example);
        setProduct(result);
        return result;
    }

    public void setProduct(List<OrdersItem> ois) {
        for (OrdersItem oi : ois) {
            setProduct(oi);
        }
    }

    private void setProduct(OrdersItem oi) {
        Product product = productService.get(oi.getPID());
        oi.setProduct(product);
    }


}
