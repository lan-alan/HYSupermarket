package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Property;

import java.util.List;

public interface IPropertyService {

    public void add(Property property);

    public void delete(long id);

    public void update(Property property);

    public Property get(long id);

    public List<Property> list(long cid);

}
