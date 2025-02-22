package com.ibroximjon.springlearning.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NewHome {
    private String message;
    public String getMessage() {
        return message;
    }
    public NewHome(){
        message = "Hello World this is new home";
    }
}
