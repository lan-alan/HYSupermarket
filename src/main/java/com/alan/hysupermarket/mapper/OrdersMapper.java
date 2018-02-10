package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Orders;
import com.alan.hysupermarket.pojo.OrdersExample;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}