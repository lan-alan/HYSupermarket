package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.IOrderMapper;
import com.alan.hysupermarket.pojo.Order;
import com.alan.hysupermarket.pojo.OrderExample;
import com.alan.hysupermarket.pojo.OrderItem;
import com.alan.hysupermarket.pojo.User;
import com.alan.hysupermarket.service.IOrderItemService;
import com.alan.hysupermarket.service.IOrderService;
import com.alan.hysupermarket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderMapper orderMapper;

    @Autowired
    private IUserService userService;

    @Autowired
    private IOrderItemService orderItemService;

    @Override
    public void add(Order order) {
        orderMapper.insert(order);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY.REQUIRED, rollbackForClassName = "Exception")
    public float add(Order order, List<OrderItem> ois) {
        float total = 0;
        add(order);
        if (false) {
            throw new RuntimeException();
        }

        for (OrderItem oi : ois) {
            oi.setOID(order.getID());
            //orderItemService.update(oi);

        }

        return total;
    }

    @Override
    public void delete(long id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public Order get(long id) {

        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Order> list() {
        OrderExample example = new OrderExample();
        example.setOrderByClause("id desc");
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<Order> list(long uid, String excludedStatus) {
        OrderExample example = new OrderExample();
        example.createCriteria().andU_IDEqualTo(uid).andSTATUSNotEqualTo(excludedStatus);
        example.setOrderByClause("id desc");
        return orderMapper.selectByExample(example);
    }

    public void setUser(List<Order> os) {
        for (Order o : os)
            setUser(o);
    }

    public void setUser(Order order) {
        long uid = order.getU_ID();
        User u = userService.get(uid);
        order.setUser(u);
    }
}
