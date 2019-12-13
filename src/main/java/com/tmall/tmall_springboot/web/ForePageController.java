package com.tmall.tmall_springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForePageController {
    @GetMapping("/")
    public String index(){
        return "redirect:home";
    }

    @GetMapping("/home")
    public String home(){
        return "fore/home";
    }

}