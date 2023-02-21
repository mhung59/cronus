package com.hero.cronus.service.impl;

import com.hero.cronus.dao.ConfigProductRepository;
import com.hero.cronus.dao.ImageProductRepository;
import com.hero.cronus.dao.ProductRepository;
import com.hero.cronus.dao.PromotionProductRepository;
import com.hero.cronus.entity.ConfigurationsProductEntity;
import com.hero.cronus.entity.ImageProductEntity;
import com.hero.cronus.entity.ProductEntity;
import com.hero.cronus.entity.PromotionProductEntity;
import com.hero.cronus.model.ProductBean;
import com.hero.cronus.model.ProductDto;
import com.hero.cronus.model.ProductThumb;
import com.hero.cronus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ConfigProductRepository configProductRepository;

    @Autowired
    private ImageProductRepository imageProductRepository;

    @Autowired
    private PromotionProductRepository promotionProductRepository;

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
    public List<ProductThumb> getAllProduct() {
        List<ProductThumb> productThumbs = new ArrayList<>();

        List<ProductEntity> products = productRepository.findAll();

        for (ProductEntity productEntity : products) {
            ProductThumb product = new ProductThumb();
            product.mapper(productEntity);
            productThumbs.add(product);
        }

        return productThumbs;
    }

    @Override
    public ProductThumb getProduct(Long id) {
        ProductEntity productEntity = productRepository.findById(id).orElse(null);
        if (productEntity != null) {
            ProductThumb product = new ProductThumb();
            product.mapper(productEntity);
            return product;
        }

        return null;
    }

    @Override
    public ProductBean getDetailProduct(Long id) {
        ProductBean productBean = new ProductBean();

        // get summary product
        ProductEntity productEntity = productRepository.findById(id).orElse(null);
        if (productEntity == null){
            return null;
        }
        productBean.setProduct(productEntity);

        // get image product
        List<ImageProductEntity> imageProducts = imageProductRepository.findByIdProduct(id);
        productBean.setImageProducts(imageProducts);

        // get pro product
        List<PromotionProductEntity> promotionProducts = promotionProductRepository.findByIdProduct(id);
        productBean.setPromotionProducts(promotionProducts);

        // get config product
        List<ConfigurationsProductEntity> configProducts = configProductRepository.findByIdProduct(id);
        productBean.setConfigurationsProducts(configProducts);

        return productBean;
    }
}
