package com.alan.hysupermarket.pojo;

import java.util.List;

public class Product {
    private Long ID;

    private String NAME;

    private String SUBTITLE;

    private Double ORIGNALPRICE;

    private Double PROMOTEPRICE;

    private Long STOCK;

    private Long CID;

    private String CREATEDATE;

    /*非数据库字段*/
    private Category category;

    private ProductImage firstProductImage;

    private List<ProductImage> productSingleImages;

    private List<ProductImage> productDetailImages;

    private int saleCount;

    private int reviewCount;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductImage getFirstProductImage() {
        return firstProductImage;
    }

    public void setFirstProductImage(ProductImage firstProductImage) {
        this.firstProductImage = firstProductImage;
    }

    public List<ProductImage> getProductSingleImages() {
        return productSingleImages;
    }

    public void setProductSingleImages(List<ProductImage> productSingleImages) {
        this.productSingleImages = productSingleImages;
    }

    public List<ProductImage> getProductDetailImages() {
        return productDetailImages;
    }

    public void setProductDetailImages(List<ProductImage> productDetailImages) {
        this.productDetailImages = productDetailImages;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getSUBTITLE() {
        return SUBTITLE;
    }

    public void setSUBTITLE(String SUBTITLE) {
        this.SUBTITLE = SUBTITLE == null ? null : SUBTITLE.trim();
    }

    public Double getORIGNALPRICE() {
        return ORIGNALPRICE;
    }

    public void setORIGNALPRICE(Double ORIGNALPRICE) {
        this.ORIGNALPRICE = ORIGNALPRICE;
    }

    public Double getPROMOTEPRICE() {
        return PROMOTEPRICE;
    }

    public void setPROMOTEPRICE(Double PROMOTEPRICE) {
        this.PROMOTEPRICE = PROMOTEPRICE;
    }

    public Long getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(Long STOCK) {
        this.STOCK = STOCK;
    }

    public Long getCID() {
        return CID;
    }

    public void setCID(Long CID) {
        this.CID = CID;
    }

    public String getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(String CREATEDATE) {
        this.CREATEDATE = CREATEDATE == null ? null : CREATEDATE.trim();
    }
}