package com.hero.cronus.service;

import com.hero.cronus.entity.ProductEntity;
import com.hero.cronus.model.ProductBean;
import com.hero.cronus.model.ProductDto;
import com.hero.cronus.model.ProductThumb;

import java.util.List;

public interface ProductService {

    ProductEntity insertProduct(ProductDto product);

    List<ProductThumb> getAllProduct();

    ProductThumb getProduct(Long id);

    ProductBean getDetailProduct(Long id);
}
