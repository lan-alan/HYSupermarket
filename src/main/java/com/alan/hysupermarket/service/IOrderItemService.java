package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Order;
import com.alan.hysupermarket.pojo.OrderItem;

import java.util.List;

public interface IOrderItemService {
    void add(OrderItem orderItem);

    void delete(long id);

    void update(OrderItem orderItem);

    OrderItem get(long id);

    List<OrderItem> list();

    void fill(List<Order> orders);

    void fill(Order order);

    int getSaleCount(long pid);

    List<OrderItem> listByUser(long uid);
}
