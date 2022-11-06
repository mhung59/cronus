package com.hero.cronus.service.impl;

import com.hero.cronus.dao.ProductRepository;
import com.hero.cronus.entity.ProductEntity;
import com.hero.cronus.model.ProductDto;
import com.hero.cronus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity insertProduct(ProductDto product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(product.getProductName());
        productEntity.setCategoryCode(product.getCategoryCode());
        productEntity.setPrice(product.getPrice());
        productEntity.setPromotionPrice(product.getPromotionPrice());
        return productRepository.save(productEntity);
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }
}
