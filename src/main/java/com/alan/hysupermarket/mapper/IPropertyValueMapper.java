package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.PropertyValue;
import com.alan.hysupermarket.pojo.PropertyValueExample;
import java.util.List;

public interface IPropertyValueMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(PropertyValue record);

    int insertSelective(PropertyValue record);

    List<PropertyValue> selectByExample(PropertyValueExample example);

    PropertyValue selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(PropertyValue record);

    int updateByPrimaryKey(PropertyValue record);
}