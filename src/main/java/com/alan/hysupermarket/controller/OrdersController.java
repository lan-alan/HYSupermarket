package com.alan.hysupermarket.controller;

import com.alan.hysupermarket.pojo.Orders;
import com.alan.hysupermarket.service.IOrdersItemService;
import com.alan.hysupermarket.service.IOrdersService;
import com.alan.hysupermarket.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("")
public class OrdersController {
    @Autowired
    private IOrdersService ordersService;
    @Autowired
    private IOrdersItemService ordersItemService;

    @RequestMapping("admin_order_list")
    public String list(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());

        List<Orders> os = ordersService.list();

        int total = (int) new PageInfo<>(os).getTotal();
        page.setTotal(total);

        ordersItemService.fill(os);

        model.addAttribute("os", os);
        model.addAttribute("page", page);

        return "admin/listOrder";
    }

    @RequestMapping("admin_order_delivery")
    public String delivery(Orders o) throws IOException {
        o.setDELIVERYDATE(new Date());
        o.setSTATUS(IOrdersService.waitConfirm);
        ordersService.update(o);
        return "redirect:admin_order_list";
    }
}