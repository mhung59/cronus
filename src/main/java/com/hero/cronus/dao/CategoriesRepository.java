package com.hero.cronus.dao;

import com.hero.cronus.entity.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Long> {
}
