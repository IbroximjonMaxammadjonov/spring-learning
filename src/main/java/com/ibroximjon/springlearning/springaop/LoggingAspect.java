package com.ibroximjon.springlearning.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.ibroximjon.springlearning.springaop.PaymentService.*(..))")
    public void beforePaymentMethod() {
        System.out.println("Payment method begin");
    }

    @After("execution(* com.ibroximjon.springlearning.springaop.PaymentService.*(..))")
    public void afterPaymentMethod() {
        System.out.println("Payment method end");
    }
}
