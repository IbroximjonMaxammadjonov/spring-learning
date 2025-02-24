package com.ibroximjon.springlearning.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ibroximjon.springlearning.springaop")
@EnableAspectJAutoProxy
public class AppConfig {
}
