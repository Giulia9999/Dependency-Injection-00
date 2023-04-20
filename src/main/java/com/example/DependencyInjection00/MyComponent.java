package com.example.DependencyInjection00;

import org.springframework.stereotype.Component;
@Component
public class MyComponent {
    private final String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called.");
        this.myComponentName = "Giulia";
    }
    public String  getMyComponentName(){
        return myComponentName;
    }
}
