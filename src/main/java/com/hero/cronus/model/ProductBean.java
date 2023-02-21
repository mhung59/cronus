package com.hero.cronus.model;

import com.hero.cronus.entity.ConfigurationsProductEntity;
import com.hero.cronus.entity.ImageProductEntity;
import com.hero.cronus.entity.ProductEntity;
import com.hero.cronus.entity.PromotionProductEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductBean {
    private ProductEntity product;
    private List<ImageProductEntity> imageProducts;
    private List<PromotionProductEntity> promotionProducts;
    private List<ConfigurationsProductEntity> configurationsProducts;
}
