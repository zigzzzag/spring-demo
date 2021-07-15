package com.example.demo.aop.annotated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAOPAnnotatedApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoAOPAnnotatedApp.class, args);

        LogTimeSample logTimeSample = (LogTimeSample) ctx.getBean("logTimeSample");
        logTimeSample.someMethod();
    }
}
