package com.ibroximjon.springlearning.springaop;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void makePayment() {
        System.out.println("Making payment.............");
    }

    public void refundPayment() {
        System.out.println("Refunding payment.........");
    }
}
