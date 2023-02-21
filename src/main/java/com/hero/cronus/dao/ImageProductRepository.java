package com.hero.cronus.dao;

import com.hero.cronus.entity.ImageProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageProductRepository extends JpaRepository<ImageProductEntity, Long> {
    List<ImageProductEntity> findByIdProduct(Long idProduct);
}
