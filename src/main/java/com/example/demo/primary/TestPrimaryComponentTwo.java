package com.example.demo.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TestPrimaryComponentTwo implements TestPrimaryComponent {

    @Override
    public void test() {
        System.out.println("test TestPrimaryComponentTwo");
    }
}
