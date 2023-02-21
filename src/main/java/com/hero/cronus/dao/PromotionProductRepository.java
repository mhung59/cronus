package com.hero.cronus.dao;

import com.hero.cronus.entity.PromotionProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionProductRepository extends JpaRepository<PromotionProductEntity, Long> {
    List<PromotionProductEntity> findByIdProduct(Long idProduct);
}
