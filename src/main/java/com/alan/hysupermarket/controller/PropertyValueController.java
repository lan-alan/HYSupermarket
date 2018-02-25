package com.alan.hysupermarket.controller;

import com.alan.hysupermarket.pojo.Product;
import com.alan.hysupermarket.pojo.PropertyValue;
import com.alan.hysupermarket.service.IProductService;
import com.alan.hysupermarket.service.IPropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("")
public class PropertyValueController {

    @Autowired
    private IPropertyValueService propertyValueService;

    @Autowired
    private IProductService productService;

    /**
     * 修改
     *
     * @param model
     * @param pid
     * @return
     */
    @RequestMapping("admin_propertyValue_edit")
    public String edit(Model model, int pid) {

        // 获取商品信息
        Product p = productService.get(pid);

        propertyValueService.init(p);

        List<PropertyValue> pvs = propertyValueService.list(p.getID());

        model.addAttribute("p", p);
        model.addAttribute("pvs", pvs);

        return "admin/editPropertyValue";
    }

    @RequestMapping("admin_propertyValue_update")
    @ResponseBody
    public String update(PropertyValue pv) {

        propertyValueService.update(pv);

        return "success";
    }

}
