package com.example.demo.primary;

import org.springframework.stereotype.Component;

@Component
public class TestPrimaryComponentOne implements TestPrimaryComponent {

    @Override
    public void test() {
        System.out.println("test TestPrimaryComponentOne");
    }
}
