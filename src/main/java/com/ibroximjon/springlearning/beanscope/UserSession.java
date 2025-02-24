package com.ibroximjon.springlearning.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class UserSession {
    public UserSession() {
        System.out.println("UserSession: Request scope - for every request new bean");
    }
}
