package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.IOrderItemMapper;
import com.alan.hysupermarket.pojo.Order;
import com.alan.hysupermarket.pojo.OrderItem;
import com.alan.hysupermarket.pojo.OrderItemExample;
import com.alan.hysupermarket.pojo.Product;
import com.alan.hysupermarket.service.IOrderItemService;
import com.alan.hysupermarket.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements IOrderItemService {

    @Autowired
    private IOrderItemMapper orderItemMapper;

    @Autowired
    private IProductService productService;

    @Override
    public void add(OrderItem orderItem) {
        orderItemMapper.insert(orderItem);
    }

    @Override
    public void delete(long id) {
        orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(OrderItem orderItem) {
        orderItemMapper.updateByPrimaryKeySelective(orderItem);
    }

    @Override
    public OrderItem get(long id) {
        OrderItem orderItem = orderItemMapper.selectByPrimaryKey(id);
        setProduct(orderItem);
        return orderItem;
    }

    @Override
    public List<OrderItem> list() {
        OrderItemExample example = new OrderItemExample();
        example.setOrderByClause("id desc");
        return orderItemMapper.selectByExample(example);
    }

    @Override
    public void fill(List<Order> orders) {
        for (Order order : orders) {
            fill(order);
        }

    }

    @Override
    public void fill(Order order) {
        OrderItemExample example = new OrderItemExample();
        example.createCriteria().andOIDEqualTo(order.getID());
        example.setOrderByClause("id desc");
        List<OrderItem> ois = orderItemMapper.selectByExample(example);
        setProduct(ois);

        float total = 0;
        int totalNumber = 0;
        for (OrderItem oi : ois) {
            total += oi.getQUANTITY() * oi.getProduct().getPROMOTEPRICE();
            totalNumber += oi.getQUANTITY();
        }
        order.setTotal(total);
        order.setTotalNumber(totalNumber);
        order.setOrderItems(ois);
    }

    @Override
    public int getSaleCount(long pid) {
        OrderItemExample example = new OrderItemExample();
        example.createCriteria().andPIDEqualTo(pid);
        List<OrderItem> ois = orderItemMapper.selectByExample(example);
        int result = 0;
        for (OrderItem oi : ois) {
            result += oi.getQUANTITY();
        }
        return result;
    }

    @Override
    public List<OrderItem> listByUser(long uid) {
        OrderItemExample example = new OrderItemExample();
        example.createCriteria().andU_IDEqualTo(uid).andOIDIsNull();
        List<OrderItem> result = orderItemMapper.selectByExample(example);
        setProduct(result);
        return result;
    }

    public void setProduct(List<OrderItem> ois) {
        for (OrderItem oi : ois) {
            setProduct(oi);
        }
    }

    private void setProduct(OrderItem oi) {
        Product product = productService.get(oi.getPID());
        oi.setProduct(product);
    }


}
