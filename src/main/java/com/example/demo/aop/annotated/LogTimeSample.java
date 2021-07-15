package com.example.demo.aop.annotated;

import org.springframework.stereotype.Component;

@Component
public class LogTimeSample {

    @LogTimeExecution
    public void someMethod() {
        System.out.println("someMethod start");
        try {
            Thread.sleep((long) (Math.random() * 3 - 1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("someMethod finished");
        }
    }
}
