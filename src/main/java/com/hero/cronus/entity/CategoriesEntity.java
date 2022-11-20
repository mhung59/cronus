package com.hero.cronus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
@Getter
@Setter
public class CategoriesEntity extends BaseEntity {
    private String categoryName;
    private String categoryCode;
    private String categoryDesc;
    private String categoryLogo;
}
