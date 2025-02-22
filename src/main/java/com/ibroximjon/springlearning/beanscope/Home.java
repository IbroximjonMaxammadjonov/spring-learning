package com.ibroximjon.springlearning.beanscope;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Home {
    private String message;
    public String getMessage() {
        return message;
    }
    public Home() {
        this.message = "Hello World";
    }
}
