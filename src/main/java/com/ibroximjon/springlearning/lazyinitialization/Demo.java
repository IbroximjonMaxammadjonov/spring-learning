package com.ibroximjon.springlearning.lazyinitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Spring container starting up");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Spring container is created");
        System.out.println("University bean does not call");
        University university = context.getBean(University.class);
        university.setName("INHA");
        System.out.println("University is " + university.getName());
        context.close();
    }
}
