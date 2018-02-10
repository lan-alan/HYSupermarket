package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Property;
import com.alan.hysupermarket.pojo.PropertyExample;
import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}