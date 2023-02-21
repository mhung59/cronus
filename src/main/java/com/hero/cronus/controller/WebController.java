package com.hero.cronus.controller;

import com.hero.cronus.entity.CategoriesEntity;
import com.hero.cronus.model.ProductBean;
import com.hero.cronus.model.ProductThumb;
import com.hero.cronus.service.BannerService;
import com.hero.cronus.service.CategoriesService;
import com.hero.cronus.service.CloudinaryService;
import com.hero.cronus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class WebController {

    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private BannerService bannerService;
    @Autowired
    private CloudinaryService cloudinaryService;
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public String viewHomePage(Model model) {
        List<CategoriesEntity> categoriesList = categoriesService.getAllCategories();
        List<ProductThumb> productList = productService.getAllProduct();
        List<String> banners = bannerService.getBannerSale();

        model.addAttribute("banners", banners);
        model.addAttribute("categoriesList", categoriesList);
        model.addAttribute("productList", productList);

        return "index";
    }

    @PostMapping(value = "/upload")
    public String uploadFile(MultipartFile multipartFile) throws IOException {
        File file = new File("src/main/resources/targetFile.tmp");
        try (OutputStream os = Files.newOutputStream(file.toPath())) {
            os.write(multipartFile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        cloudinaryService.uploadFile(file);
        return null;
    }

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/detail")
    public String detailProduct(@RequestParam(value = "id") Long id, Model model) {
        ProductThumb product = productService.getProduct(id);
        ProductBean productBean = productService.getDetailProduct(id);
        model.addAttribute("product", productBean);
        return "detail";
    }
}
