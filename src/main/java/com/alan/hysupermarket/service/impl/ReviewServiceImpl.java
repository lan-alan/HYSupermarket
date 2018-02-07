package com.alan.hysupermarket.service.impl;

import com.alan.hysupermarket.mapper.IReviewMapper;
import com.alan.hysupermarket.pojo.Review;
import com.alan.hysupermarket.pojo.ReviewExample;
import com.alan.hysupermarket.pojo.User;
import com.alan.hysupermarket.service.IReviewService;
import com.alan.hysupermarket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements IReviewService {

    @Autowired
    private IReviewMapper reviewMapper;

    @Autowired
    private IUserService userService;

    @Override
    public void add(Review review) {
        reviewMapper.insert(review);
    }

    @Override
    public void delete(long id) {
        reviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Review review) {
        reviewMapper.updateByPrimaryKeySelective(review);
    }

    @Override
    public Review get(long id) {
        return reviewMapper.selectByPrimaryKey(id);
    }

    public List<Review> list(long pid) {
        ReviewExample example = new ReviewExample();
        example.createCriteria().andPIDEqualTo(pid);
        example.setOrderByClause("id desc");

        List<Review> result = reviewMapper.selectByExample(example);
        setUser(result);
        return result;
    }

    public void setUser(List<Review> reviews) {
        for (Review review : reviews) {
            setUser(review);
        }
    }

    private void setUser(Review review) {
        long uid = review.getU_ID();
        User user = userService.get(uid);
        review.setUser(user);
    }

    @Override
    public int getCount(long pid) {
        return list(pid).size();
    }
}
