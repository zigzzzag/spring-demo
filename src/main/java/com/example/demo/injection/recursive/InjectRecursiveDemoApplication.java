package com.example.demo.injection.recursive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class InjectRecursiveDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(InjectRecursiveDemoApplication.class, args);
        RecursiveBeanOne recursiveBeanOne = (RecursiveBeanOne) ctx.getBean("recursiveBeanOne");
        RecursiveBeanTwo recursiveBeanTwo = (RecursiveBeanTwo) ctx.getBean("recursiveBeanTwo");

        recursiveBeanOne.test();
        recursiveBeanTwo.test();
    }
}
