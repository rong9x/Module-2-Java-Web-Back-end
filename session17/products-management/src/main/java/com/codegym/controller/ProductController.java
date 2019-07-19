package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    private IProductService productService = new ProductService();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "index";
    }

    @GetMapping("/product/create")
    public String createForm(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("product/save")
    public String create(Product product, RedirectAttributes redirectAttributes){
        product.setId((int) (Math.random() * 96) + 5);
        productService.saveProduct(product);
        redirectAttributes.addFlashAttribute("success", "Added new product successfully!");
        return "redirect:/";
    }

    @GetMapping("/product/edit/{id}")
    public String editForm(Model model, @PathVariable int id){
        model.addAttribute("product", productService.getProductById(id));
        return "edit";
    }

    @PostMapping("/product/update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        productService.updateProduct(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "Update product successfully!");
        return "redirect:/";
    }

    @GetMapping("product/view/{id}")
    public String viewDetail(Model model, @PathVariable int id){
        model.addAttribute("product", productService.getProductById(id));
        return "view";
    }

    @GetMapping("/product/delete/{id}")
    public String deleteForm(Model model, @PathVariable int id){
        model.addAttribute("product", productService.getProductById(id));
        return "delete";
    }

    @PostMapping("/product/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes){
        productService.deleteProduct(product.getId());
        redirectAttributes.addFlashAttribute("success", "Deleted product successfully!");
        return "redirect:/";
    }
}
