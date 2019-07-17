package com.codegym.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/calculator")
    public String calculator(ModelMap modelMap, @RequestParam String textbox1, String textbox2, char button) {
        try {
            double number1 = Double.parseDouble(textbox1);
            double number2 = Double.parseDouble(textbox2);
            double result = 0;
            switch (button) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
            }
            modelMap.addAttribute("result", "Result: " + result);
        } catch (NumberFormatException e) {
            modelMap.addAttribute("result", "Invalid input");
        }
        return "index";
    }
}
