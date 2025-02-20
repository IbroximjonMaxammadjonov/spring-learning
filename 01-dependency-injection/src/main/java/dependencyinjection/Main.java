package src.main.java.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import src.main.java.dependencyinjection.diwithconfigandbean.AppConfig;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive(); // dependency injected manually

        ApplicationContext context = new AnnotationConfigApplicationContext("src.main.java.dependencyinjection");
        Car car2 =  context.getBean(Car.class);
        car2.drive(); // dependency injected with spring framework



    }
}