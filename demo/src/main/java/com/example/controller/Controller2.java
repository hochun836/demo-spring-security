package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl2")
public class Controller2 {

    @GetMapping("/demo")
    public String demo() {
        var msg = "ctrl2 - demo";
        System.out.println(msg);
        return msg;
    }
}
