package com.hero.cronus.model;

public class ProductView {
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
}
