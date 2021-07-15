package com.example.demo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeBean {

    private final String name = "ScopeSessionBean";

    public String getName() {
        return name + " " + hashCode();
    }
}
