package com.zitro.casino_v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /*@GetMapping("/login")
    public String login() {
        return "login";
    }*/

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/logout")
    public String logout() {
        return "index";
    }


}
