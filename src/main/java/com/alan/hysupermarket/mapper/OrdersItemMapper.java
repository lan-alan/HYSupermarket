package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.OrdersItem;
import com.alan.hysupermarket.pojo.OrdersItemExample;
import java.util.List;

public interface OrdersItemMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(OrdersItem record);

    int insertSelective(OrdersItem record);

    List<OrdersItem> selectByExample(OrdersItemExample example);

    OrdersItem selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(OrdersItem record);

    int updateByPrimaryKey(OrdersItem record);
}