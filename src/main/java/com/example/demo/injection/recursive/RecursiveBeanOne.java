package com.example.demo.injection.recursive;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class RecursiveBeanOne {

    private final RecursiveBeanTwo simpleBeanTwo;
    private final String name = "one";

    public String getName() {
        return "one " + hashCode();
    }

    public void test() {
        System.out.println("it`s SimpleBeanOne msg: " + simpleBeanTwo.getName());
    }
}
