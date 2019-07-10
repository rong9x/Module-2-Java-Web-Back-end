package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertCurrencyController {
    @GetMapping("/convert")
    public String convert(){
        return "index";
    }

    @GetMapping("/result")
    public String result(@RequestParam double amount, double rate, Model model){
        double vnd = amount * rate;
        model.addAttribute("result", vnd);
        return "result";
    }
}
