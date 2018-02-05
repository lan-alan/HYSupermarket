package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.OrderItem;
import com.alan.hysupermarket.pojo.OrderItemExample;
import java.util.List;

public interface IOrderItemMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectByExample(OrderItemExample example);

    OrderItem selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}