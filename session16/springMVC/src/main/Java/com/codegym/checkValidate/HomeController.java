package com.codegym.checkValidate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequestMapping("")
@Controller
public class HomeController {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public HomeController() {
        pattern = Pattern.compile(REGEX_EMAIL);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.addAttribute("message", "Hello Maven Spring MVC");
        return "hello";
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public String user(@RequestParam("email") String email, ModelMap model) {
        boolean isValid = validate(email);
        if (!isValid) {
            model.addAttribute("fail", email);
            return "result";
        }
        model.addAttribute("notification", email);
        return "hello";
    }

    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
