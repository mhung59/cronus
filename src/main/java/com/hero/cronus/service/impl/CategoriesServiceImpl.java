package com.hero.cronus.service.impl;

import com.hero.cronus.dao.CategoriesRepository;
import com.hero.cronus.entity.Categories;
import com.hero.cronus.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }
}
