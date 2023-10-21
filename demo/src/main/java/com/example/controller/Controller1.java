package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl1")
public class Controller1 {

    @GetMapping("/demo")
    public String demo() {
        var msg = "ctrl1 - demo";
        System.out.println(msg);
        return msg;
    }
}
