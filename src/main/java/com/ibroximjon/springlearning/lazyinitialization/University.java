package com.ibroximjon.springlearning.lazyinitialization;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class University {

    private String name;


    public University() {
        this.name = "University with lazy initialization";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
