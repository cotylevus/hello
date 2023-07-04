package com.example.hello.conrtoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("发起了一次请求");
    return "hello";
    }
}
