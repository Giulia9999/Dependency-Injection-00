package com.example.DependencyInjection00;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called.");
        this.myComponentName = "Giulia";
    }
    public String  getMyComponentName(){
        return myComponentName;
    }
}
