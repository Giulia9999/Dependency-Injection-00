package com.example.DependencyInjection00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private MyComponent myComponent;

    public MyService() {
        System.out.println("MyService constructor has been called.");
    }

    public String getName(){
        System.out.println("MyComponent.getMyComponentName() has been called.");
        return myComponent.getMyComponentName();
    }
}
