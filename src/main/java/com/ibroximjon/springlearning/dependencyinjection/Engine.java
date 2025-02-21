package com.ibroximjon.springlearning.dependencyinjection;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start(){
        System.out.println("Engine started");
    }

    @PostConstruct
    public void init(){
        System.out.println("Engine: PostConstruct started - Engine is ready");
    }

    public void Engine(){
        System.out.println("Engine: Engine started");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Engine:PreDestroy worked Engine is destroying...");
    }
}