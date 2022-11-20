package com.hero.cronus.service.impl;

import com.hero.cronus.dao.ProductRepository;
import com.hero.cronus.entity.ProductEntity;
import com.hero.cronus.model.ProductDto;
import com.hero.cronus.model.ProductView;
import com.hero.cronus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<ProductView> getAllProduct() {
        List<ProductView> productViews = new ArrayList<>();

        List<ProductEntity> products = productRepository.findAll();

        for (ProductEntity productEntity : products) {
            ProductView product = new ProductView();
            product.setProductName(productEntity.getProductName());
            product.setPrice(productEntity.getPromotionPrice());
            product.setProductThumb(productEntity.getProductThumb());
            double percent = (double) (productEntity.getPrice()-productEntity.getPromotionPrice())/productEntity.getPrice();
            Long percentPrice = Math.round(percent * 100);
            product.setPercentPrice(percentPrice);

            productViews.add(product);
        }

        return productViews;
    }
}
