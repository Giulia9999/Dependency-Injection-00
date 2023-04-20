package com.example.DependencyInjection00;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
    private final MyService myService;
    public MyController(MyService myService) {
        System.out.println("MyController constructor has been called.");
        this.myService = myService;
    }

    @GetMapping("getName")
    public String getName() {
        System.out.println("MyService.getName() has been called.");
        return myService.getName();
    }

    @GetMapping
    public String welcome() {
        System.out.println("Default mapping / has been called.");
        return "Welcome to my Spring Boot application!";
    }
}

