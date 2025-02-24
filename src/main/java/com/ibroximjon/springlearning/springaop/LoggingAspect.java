package com.ibroximjon.springlearning.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning(
            pointcut = "execution(* com.ibroximjon.springlearning.springaop.PaymentService.*(..))",
            returning = "result")
    public void afterReturningPaymentMethod(Object result) {
        System.out.println("✅ Metod muvaffaqiyatli yakunlandi! Qaytgan qiymat: " + result);
    }


    @AfterThrowing(
            pointcut = "execution(* com.ibroximjon.springlearning.springaop.PaymentService.*(..))",
            throwing = "ex")
    public void afterThrowingMethod(Throwable ex) {
        System.out.println("❌ @AfterThrowing: Metodda exception bo‘ldi: " + ex.getMessage());
    }

    @Around("execution(* com.ibroximjon.springlearning.springaop.PaymentService.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        System.out.println("🔄 @Around boshlanmoqda...");
        Object result = null;
        try {
            System.out.println("🔹 @Around: Metod: " + joinPoint.getSignature().getName());
            result = joinPoint.proceed();
            System.out.println("✅ @Around: Metod muvaffaqiyatli tugadi!");
        } catch (Throwable ex) {
            System.out.println("❌ @Around: Xatolik sodir bo‘ldi: " + ex.getMessage());
        } finally {
            System.out.println("🔚 @Around tugadi!");
        }
        return result;
    }

}
