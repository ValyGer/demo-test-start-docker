package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("dolls")
public class DollController {

    @GetMapping
    public String getDolls() {
        log.info("Response send: status 200");
        return "hello";
    }
}
