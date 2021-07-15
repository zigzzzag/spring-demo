package com.example.demo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeBean {

    private final String name = "ScopeRequestBean";

    public String getName() {
        return name + " " + hashCode();
    }
}
