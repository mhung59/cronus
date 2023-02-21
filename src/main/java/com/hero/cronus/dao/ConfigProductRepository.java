package com.hero.cronus.dao;

import com.hero.cronus.entity.ConfigurationsProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConfigProductRepository extends JpaRepository<ConfigurationsProductEntity, Long> {
    List<ConfigurationsProductEntity> findByIdProduct(Long idProduct);
}
