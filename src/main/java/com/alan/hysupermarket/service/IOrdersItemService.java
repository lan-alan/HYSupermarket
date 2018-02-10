package com.alan.hysupermarket.service;


import com.alan.hysupermarket.pojo.Orders;
import com.alan.hysupermarket.pojo.OrdersItem;

import java.util.List;

public interface IOrdersItemService {
    void add(OrdersItem OrdersItem);

    void delete(long id);

    void update(OrdersItem OrdersItem);

    OrdersItem get(long id);

    List<OrdersItem> list();

    void fill(List<Orders> Orders);

    void fill(Orders Orders);

    int getSaleCount(long pid);

    List<OrdersItem> listByUser(long uid);
}
