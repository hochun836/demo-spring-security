package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl3")
public class Controller3 {

    @GetMapping("/demo")
    public String demo() {
        var msg = "ctrl3 - demo";
        System.out.println(msg);
        return msg;
    }
}
