package com.hero.cronus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "promotion_product")
@Getter
@Setter
public class PromotionProductEntity extends BaseEntity {
    private String proCode;
    private String proDesc;
    private Long idProduct;
}
