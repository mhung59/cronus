package com.hero.cronus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "configurations_product")
@Getter
@Setter
public class ConfigurationsProductEntity extends BaseEntity {
    private String label;
    private String value;
    private String type;
    private Long idProduct;
}
