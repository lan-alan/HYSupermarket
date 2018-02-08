package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Order;
import com.alan.hysupermarket.pojo.OrderItem;

import java.util.List;

public interface IOrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order order);

    float add(Order order, List<OrderItem> ois);

    void delete(long id);

    void update(Order order);

    Order get(long id);

    List<Order> list();

    List<Order> list(long uid, String excludedStatus);
}
