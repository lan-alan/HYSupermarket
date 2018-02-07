package com.alan.hysupermarket.pojo;

import com.alan.hysupermarket.mapper.IReviewMapper;
import com.alan.hysupermarket.service.IReviewService;
import com.alan.hysupermarket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class Property {
    private Long ID;

    private Long CID;

    private String NAME;

    /*非数据库字段*/
    private Category  category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getCID() {
        return CID;
    }

    public void setCID(Long CID) {
        this.CID = CID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    @Service
    public static class ReviewServiceImpl implements IReviewService {

        @Autowired
        private IReviewMapper reviewMapper;

        @Autowired
        IUserService userService;

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

        @Override
        public List<Review> list(long pid) {

            ReviewExample example = new ReviewExample();
            example.createCriteria().andPIDEqualTo(pid);
            example.setOrderByClause("id desc");
            List<Review> result = reviewMapper.selectByExample(example);

            return null;
        }

        // 设置一个用户
        public void setUser(List<Review> reviews) {
            for (Review review : reviews) {
                setUser(review);
            }
        }

        public void setUser(Review review){
            long uid = review.getU_ID();
            User user = userService.get(uid);
            review.setUser(user);
        }

        @Override
        public int getCount(long pid) {
            return 0;
        }
    }
}