package com.codegym.timezone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/")
    public String home(@RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city,
                       ModelMap modelMap) {
        //get current time of local
        Date date = new Date();
        //get current timzezone by local
        TimeZone local = TimeZone.getDefault();
        //get timezone of specified city
        TimeZone locale = TimeZone.getTimeZone(city);

        //calculate current time of specified city
        long localeTime = date.getTime() + (locale.getRawOffset() - locale.getRawOffset());
        date.setTime(localeTime);

        modelMap.addAttribute("city", city);
        modelMap.addAttribute("date", date);
        return "index";
    }
}
