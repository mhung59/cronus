package com.hero.cronus.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String productName;
    private String categoryCode;
    private Long price;
    private Long promotionPrice;
    private boolean status;
}
