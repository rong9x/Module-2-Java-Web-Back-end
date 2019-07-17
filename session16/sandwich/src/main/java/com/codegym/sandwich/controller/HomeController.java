package com.codegym.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/result")
    public String result(ModelMap modelMap, @RequestParam String[] condiments){
        modelMap.addAttribute("result", condiments);
        return "result";
    }
}
