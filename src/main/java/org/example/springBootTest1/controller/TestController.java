package org.example.springBootTest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @GetMapping(value = "hello")
    public String hello() {
        return "hello jenkins! v4.0.0";
    }
}
