package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dolls")
public class DollController {

    @GetMapping
    public String getDolls() {
        return "hello";
    }
}
