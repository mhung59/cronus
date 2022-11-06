package com.hero.cronus.service;

import com.hero.cronus.entity.ProductEntity;
import com.hero.cronus.model.ProductDto;

import java.util.List;

public interface ProductService {

    ProductEntity insertProduct(ProductDto product);

    List<ProductEntity> getAllProduct();

}
