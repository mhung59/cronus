package com.hero.cronus.service.impl;

import com.hero.cronus.dao.BannerRepository;
import com.hero.cronus.entity.BannerEntity;
import com.hero.cronus.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public List<String> getBannerSale() {
        List<BannerEntity> bannerEntityList = bannerRepository.findAll();
        return bannerEntityList.stream().map(BannerEntity::getBannerUrl).collect(Collectors.toList());
    }
}
