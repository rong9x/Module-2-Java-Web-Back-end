package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ModelAndView showListUser(){
        Iterable<User> users = userService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/create-user")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/create-user")
    public ModelAndView createUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("create");
            modelAndView.addObject("message", "Invalid input");
            return modelAndView;
        }
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("message", "New user added!");
        return modelAndView;
    }

}
