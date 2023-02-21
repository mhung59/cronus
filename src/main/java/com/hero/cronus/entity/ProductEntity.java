package com.hero.cronus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductEntity extends BaseEntity {
    private String productName;
    private String categoryCode;
    private Long price;
    private Long promotionPrice;
    private String productThumb;
}
