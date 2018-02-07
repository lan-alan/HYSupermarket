package com.alan.hysupermarket.service;

import com.alan.hysupermarket.pojo.Review;

import java.util.List;

public interface IReviewService {

    public void add(Review review);

    public void delete(long id);

    public void update(Review review);

    public Review get(long id);

    public List<Review> list(long pid);

    public int getCount(long pid);

}
