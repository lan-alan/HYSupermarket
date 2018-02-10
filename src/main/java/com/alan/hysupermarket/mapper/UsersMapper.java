package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Users;
import com.alan.hysupermarket.pojo.UsersExample;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}