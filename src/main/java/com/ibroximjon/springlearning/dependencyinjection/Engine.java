package com.ibroximjon.springlearning.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start(){
        System.out.println("Engine started");
    }
}