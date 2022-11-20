package com.hero.cronus.controller;

import com.hero.cronus.entity.CategoriesEntity;
import com.hero.cronus.model.ProductView;
import com.hero.cronus.service.CategoriesService;
import com.hero.cronus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class WebController {

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private ProductService productService;
    @GetMapping(value = "/")
    public String viewHomePage(Model model){
        List<CategoriesEntity> categoriesList = categoriesService.getAllCategories();
        List<ProductView> productList = productService.getAllProduct();
        model.addAttribute("categoriesList", categoriesList);
        model.addAttribute("productList", productList);
        return "index";
    }

    @GetMapping(value = "/detail")
    public String detailProduct(Model model){
        return "detail";
    }
}
