package com.ibroximjon.springlearning;

import com.ibroximjon.springlearning.dependencyinjection.Car;
import com.ibroximjon.springlearning.dependencyinjection.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringLearningApplication {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive(); // dependency injected manually

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ibroximjon.springlearning");
        Car car1 = context.getBean(Car.class);
        car1.drive();

    }

}
