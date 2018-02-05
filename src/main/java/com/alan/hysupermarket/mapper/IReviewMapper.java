package com.alan.hysupermarket.mapper;

import com.alan.hysupermarket.pojo.Review;
import com.alan.hysupermarket.pojo.ReviewExample;
import java.util.List;

public interface IReviewMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}