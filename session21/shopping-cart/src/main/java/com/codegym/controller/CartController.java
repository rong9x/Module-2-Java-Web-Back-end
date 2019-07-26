package com.codegym.controller;

import com.codegym.model.Item;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private ProductService productService;

    @GetMapping("/cart")
    public String showCart() {
        return "cart";
    }


    @GetMapping("/cart/{id}")
    public String addToCart(@PathVariable Long id, HttpSession session, Model model) {
        double total = 0;
        List<Item> cart = new ArrayList<Item>();
        if (session.getAttribute("cart") == null) {
            Item selectedItem = new Item(productService.findById(id), 1);
            cart.add(selectedItem);
            total = selectedItem.getProduct().getPrice();
            session.setAttribute("cart", cart);
        } else {
            cart = (List<Item>) session.getAttribute("cart");
            int index = this.exists(id, cart);
            if (index == -1) {
                Item selectedItem = new Item(productService.findById(id), 1);
                cart.add(selectedItem);
            } else {
                int quantity = cart.get(index).getQuantity() + 1;
                cart.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", cart);
            for (int i = 0; i < cart.size(); i++){
                total += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
            }
        }
        model.addAttribute("cart", cart);
        model.addAttribute("total", total);
        return "cart";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable Long id, HttpSession session, Model model) {
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        int index = this.exists(id, cart);
        cart.remove(index);
        session.setAttribute("cart", cart);
        double total = 0;
        for (int i = 0; i < cart.size(); i ++) {
            total += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
        }
        model.addAttribute("cart", cart);
        model.addAttribute("total", total);
        return "cart";
    }

    private int exists(Long id, List<Item> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProduct().getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
