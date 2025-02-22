package com.ibroximjon.springlearning.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ibroximjon.springlearning.beanscope");
        Home home =context.getBean(Home.class);
        Home home2 = context.getBean(Home.class);
        System.out.println(home.getMessage());
        System.out.println(home == home2); //true because this is a singleton
    }
}
