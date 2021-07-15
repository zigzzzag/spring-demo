package com.example.demo.primary;

import org.springframework.stereotype.Component;

@Component
public class TestPrimaryComponentThree implements TestPrimaryComponent {

    @Override
    public void test() {
        System.out.println("test TestPrimaryComponentThree");
    }
}
