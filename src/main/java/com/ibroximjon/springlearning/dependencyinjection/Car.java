package com.ibroximjon.springlearning.dependencyinjection;


import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car constructor is called");
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}