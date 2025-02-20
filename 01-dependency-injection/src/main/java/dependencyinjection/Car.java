package src.main.java.dependencyinjection;


import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}