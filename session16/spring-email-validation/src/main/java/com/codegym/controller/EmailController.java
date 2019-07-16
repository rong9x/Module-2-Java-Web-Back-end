package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {

    private Pattern pattern;
    private Matcher matcher;

    private final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailController() {
        pattern = Pattern.compile(REGEX_EMAIL);
    }

    public boolean checkValidation (String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/validate")
    public String validate(@RequestParam String email, ModelMap modelMap) {
        boolean isValid = checkValidation(email);
        if (!isValid) {
            modelMap.addAttribute("fail", email);
            return "error";
        }
        modelMap.addAttribute("message", email);
        return "success";
    }

}
