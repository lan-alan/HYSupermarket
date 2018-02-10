package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.PropertyValueMapper;
import com.alan.hysupermarket.pojo.Product;
import com.alan.hysupermarket.pojo.Property;
import com.alan.hysupermarket.pojo.PropertyValue;
import com.alan.hysupermarket.pojo.PropertyValueExample;
import com.alan.hysupermarket.service.IPropertyService;
import com.alan.hysupermarket.service.IPropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyValueServiceImpl implements IPropertyValueService {

    @Autowired
    private PropertyValueMapper propertyValueMapper;

    @Autowired
    private IPropertyService propertyService;

    @Override
    public void init(Product product) {
        List<Property> propertyList = propertyService.list(product.getCID());

        for (Property property : propertyList) {
            PropertyValue propertyValue = get(property.getID(), product.getID());
            if (null == propertyValue) {
                propertyValue = new PropertyValue();
                propertyValue.setPID(product.getID());
                propertyValue.setPID(property.getID());
                propertyValueMapper.insert(propertyValue);
            }
        }

    }

    @Override
    public void update(PropertyValue propertyValue) {
        propertyValueMapper.updateByPrimaryKeySelective(propertyValue);
    }

    @Override
    public PropertyValue get(long ptid, long pid) {
        PropertyValueExample example = new PropertyValueExample();
        example.createCriteria().andPTIDEqualTo(ptid).andPIDEqualTo(pid);
        List<PropertyValue> pvs = propertyValueMapper.selectByExample(example);
        if (pvs.isEmpty()) {
            return null;
        }
        return pvs.get(0);
    }

    @Override
    public List<PropertyValue> list(long pid) {
        PropertyValueExample example = new PropertyValueExample();
        example.createCriteria().andPIDEqualTo(pid);
        List<PropertyValue> result = propertyValueMapper.selectByExample(example);
        for (PropertyValue pv : result) {
            Property property = propertyService.get(pv.getPTID());
            pv.setProperty(property);
        }
        return result;
    }
}
