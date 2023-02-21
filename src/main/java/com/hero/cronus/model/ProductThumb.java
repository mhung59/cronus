package com.hero.cronus.model;

import com.hero.cronus.entity.ProductEntity;

public class ProductThumb {
    private Long id;
    private String productName;
    private String categoryCode;
    private Long price;
    private Long percentPrice;
    private String productThumb;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPercentPrice() {
        return percentPrice;
    }

    public void setPercentPrice(Long percentPrice) {
        this.percentPrice = percentPrice;
    }

    public String getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(String productThumb) {
        this.productThumb = productThumb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void mapper(ProductEntity productEntity){
        this.setId(productEntity.getId());
        this.setProductName(productEntity.getProductName());
        this.setPrice(productEntity.getPromotionPrice());
        this.setProductThumb(productEntity.getProductThumb());
        double percent = (double) (productEntity.getPrice()-productEntity.getPromotionPrice())/productEntity.getPrice();
        Long percentPrice = Math.round(percent * 100);
        this.setPercentPrice(percentPrice);
    }
}
