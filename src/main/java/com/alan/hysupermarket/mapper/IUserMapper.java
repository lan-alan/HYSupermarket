package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.User;
import com.alan.hysupermarket.pojo.UserExample;
import java.util.List;

public interface IUserMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}