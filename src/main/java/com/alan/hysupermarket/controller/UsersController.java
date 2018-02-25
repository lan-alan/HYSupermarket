package com.alan.hysupermarket.controller;

import com.alan.hysupermarket.pojo.Users;
import com.alan.hysupermarket.service.IUsersService;
import com.alan.hysupermarket.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * 用户的Controller层
 */
@Controller
@RequestMapping("")
public class UsersController {

    @Autowired
    private IUsersService usersService;

    /**
     * 用户管理信息
     *
     * @param model
     * @param page
     * @return
     */
    @RequestMapping("admin_user_list")
    public String list(Model model, Page page) {

        // 获得起始页与数量
        PageHelper.offsetPage(page.getStart(), page.getCount());

        // 获取用户信息（全部的用户）
        List<Users> us = usersService.list();

        // 获取用户的总数
        int total = (int) new PageInfo<>(us).getTotal();

        page.setTotal(total);

        model.addAttribute("us", us);
        model.addAttribute("page", page);

        // 跳转到相应的界面
        return "admin/listUser";
    }

}
