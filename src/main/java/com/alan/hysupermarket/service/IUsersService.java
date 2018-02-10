package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Users;

import java.util.List;

/**
 * 用户业务服务接口类
 */
public interface IUsersService {
    /**
     * 新增一名用户
     *
     * @param users
     */
    public void add(Users users);

    /**
     * 通过ID删除一名用户
     *
     * @param id
     */
    public void delete(long id);

    /**
     * 更改一个用户的信息
     *
     * @param Users
     */
    public void update(Users Users);

    /**
     * 通过ID查询一名用户的信息
     *
     * @param id
     * @return 返回一个用户信息
     */
    public Users get(long id);

    /**
     * 查询全部用户的信息
     *
     * @return
     */
    public List<Users> list();

    /**
     * 是否存在该用户
     *
     * @param name
     * @return 返回true 或者false
     */
    public boolean isExist(String name);

    /**
     * 通过用户名和密码获取一个用户信息
     *
     * @param name
     * @param password
     * @return
     */
    public Users get(String name, String password);


}
