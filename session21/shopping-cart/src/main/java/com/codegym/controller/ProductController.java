package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ModelAndView showListProducts(){
        Iterable<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/create-product")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create-product")
    public ModelAndView createProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("create");
            modelAndView.addObject("message", "Invalid input");
            return modelAndView;
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New product added!");
        return modelAndView;
    }

    @GetMapping("/view-product/{id}")
    public ModelAndView showProductDetail(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("view");
            modelAndView.addObject("product", product);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }
}
