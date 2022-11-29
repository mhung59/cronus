package com.hero.cronus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banner")
@Getter
@Setter
public class BannerEntity extends BaseEntity{
    private String bannerCode;
    private String bannerName;
    private String bannerUrl;
}
