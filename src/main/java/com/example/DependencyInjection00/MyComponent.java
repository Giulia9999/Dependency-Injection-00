package com.example.DependencyInjection00;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent(String myName){
        this.myComponentName = myName;
    }
    public String  getMyComponentName(){
        return myComponentName;
    }
}
