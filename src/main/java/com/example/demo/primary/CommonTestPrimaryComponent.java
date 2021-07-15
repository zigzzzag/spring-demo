package com.example.demo.primary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommonTestPrimaryComponent {

    private final TestPrimaryComponent testPrimaryComponent;

    public void testPrimary() {
        testPrimaryComponent.test();
    }
}
