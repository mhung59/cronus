package com.hero.cronus.controller;

import com.hero.cronus.entity.Categories;
import com.hero.cronus.entity.ProductEntity;
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
    @GetMapping(value = "home")
    public String viewHomePage(Model model){
        List<Categories> categoriesList = categoriesService.getAllCategories();
        List<ProductEntity> productList = productService.getAllProduct();
        model.addAttribute("categoriesList", categoriesList);
        model.addAttribute("productList", productList);
        return "index";
    }
}
