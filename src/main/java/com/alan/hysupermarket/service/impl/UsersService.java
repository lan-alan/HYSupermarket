package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.UsersMapper;
import com.alan.hysupermarket.pojo.Users;
import com.alan.hysupermarket.pojo.UsersExample;
import com.alan.hysupermarket.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务服务实现类
 */
@Service
public class UsersService implements IUsersService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 新增一名用户（注册）
     *
     * @param user
     */
    @Override
    public void add(Users user) {
        usersMapper.insert(user);
    }

    /**
     * 删除一名用户
     *
     * @param id
     */
    @Override
    public void delete(long id) {
        usersMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新用户信息
     *
     * @param user
     */
    @Override
    public void update(Users user) {
        usersMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 查询一个用户信息
     *
     * @param id
     * @return
     */
    @Override
    public Users get(long id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    /**
     * 显示全部用户的信息
     *
     * @return
     */
    @Override
    public List<Users> list() {
        // 用于排序查询
        UsersExample example = new UsersExample();
        example.setOrderByClause("id desc");
        return usersMapper.selectByExample(example);
    }

    /**
     * 是否存在该用户
     *
     * @param name
     * @return
     */
    @Override
    public boolean isExist(String name) {
        UsersExample example = new UsersExample();
        // 用于判断用户名是否存在
        example.createCriteria().andNAMEEqualTo(name);
        List<Users> result = usersMapper.selectByExample(example);
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
    public Users get(String name, String password) {
        UsersExample example = new UsersExample();
        // 通过用户名和密码查询用户信息
        example.createCriteria().andNAMEEqualTo(name).andPASSWORDEqualTo(password);
        List<Users> result = usersMapper.selectByExample(example);
        if (result.isEmpty()) {
            return null;
        }
        // 如果存在则取集合的第一个
        return result.get(0);
    }
}
