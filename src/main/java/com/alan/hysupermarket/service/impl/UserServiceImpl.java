package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.IUserMapper;
import com.alan.hysupermarket.pojo.User;
import com.alan.hysupermarket.pojo.UserExample;
import com.alan.hysupermarket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务服务实现类
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    /**
     * 新增一名用户（注册）
     *
     * @param user
     */
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    /**
     * 删除一名用户
     *
     * @param id
     */
    @Override
    public void delete(long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新用户信息
     *
     * @param user
     */
    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 查询一个用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User get(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 显示全部用户的信息
     *
     * @return
     */
    @Override
    public List<User> list() {
        // 用于排序查询
        UserExample example = new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example);
    }

    /**
     * 是否存在该用户
     *
     * @param name
     * @return
     */
    @Override
    public boolean isExist(String name) {
        UserExample example = new UserExample();
        // 用于判断用户名是否存在
        example.createCriteria().andNAMEEqualTo(name);
        List<User> result = userMapper.selectByExample(example);
        // 如果不存在这个用户名
        if (!result.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 通过用户名和密码查询用户信息。可用于登录
     *
     * @param name
     * @param password
     * @return 返回一个用户信息
     */
    @Override
    public User get(String name, String password) {
        UserExample example = new UserExample();
        // 通过用户名和密码查询用户信息
        example.createCriteria().andNAMEEqualTo(name).andPASSWORDEqualTo(password);
        List<User> result = userMapper.selectByExample(example);
        if (result.isEmpty()) {
            return null;
        }
        // 如果存在则取集合的第一个
        return result.get(0);
    }
}
