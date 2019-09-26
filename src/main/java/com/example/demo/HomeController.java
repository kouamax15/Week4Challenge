package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
        public String home(){
            return "homepage";
    }
    @GetMapping("/entry1")
    public String entry1(){
        return "entry1";
    }
    @GetMapping("/entry2")
    public String entry2(){
        return "entry2";
    }
    @GetMapping("/entry3")
    public String entry3(){
        return "entry3";
    }
    @GetMapping("/aboutjava")
    public String aboutJavaBootcamp(){
        return "aboutjava";
    }
    @GetMapping("/authorprofile")
    public String authorProfile(){
        return "authorprofile";
    }
}
