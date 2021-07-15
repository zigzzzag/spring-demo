package com.example.demo.injection.recursive;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class RecursiveBeanTwo {

    @Lazy
    @Autowired
    private RecursiveBeanOne simpleBeanOne;
    private final String name = "two";

    public void test() {
        System.out.println("it`s SimpleBeanTwo msg: " + simpleBeanOne.getName());
    }
}
