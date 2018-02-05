package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Order;
import com.alan.hysupermarket.pojo.OrderExample;
import java.util.List;

public interface IOrderMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}