package com.ibroximjon.springlearning.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.makePayment();
        paymentService.refundPayment();
        context.close();
    }
}
