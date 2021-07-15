package com.example.demo.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoPrimaryApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoPrimaryApp.class, args);

        CommonTestPrimaryComponent commonTestPrimaryComponent = (CommonTestPrimaryComponent) ctx.getBean("commonTestPrimaryComponent");
        commonTestPrimaryComponent.testPrimary();
    }
}
