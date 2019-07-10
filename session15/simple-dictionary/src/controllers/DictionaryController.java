package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/translate")
    public String translate(){
        return "index";
    }

    @GetMapping("/result")
    public String showResult(@RequestParam String keyword, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin chào");
        dictionary.put("Bye", "Tạm biệt");
        dictionary.put("Hi", "Chào");

        String notification;
        String result = dictionary.get(keyword);

        if (result != null) {
            notification = result;
        } else {
            notification = "Not exits";
        }

        model.addAttribute("result", notification);
        return "result";
    }
}
