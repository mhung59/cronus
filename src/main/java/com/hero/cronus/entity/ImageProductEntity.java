package com.hero.cronus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "image_product")
@Getter
@Setter
public class ImageProductEntity extends BaseEntity {
    private String link;
    private String alt;
    private Long idProduct;
}
