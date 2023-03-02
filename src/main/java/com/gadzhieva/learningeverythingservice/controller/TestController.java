package com.gadzhieva.learningeverythingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get/{text}")
    public String get(@PathVariable String text) {
        System.out.println(text);
        return text;
    }
}
