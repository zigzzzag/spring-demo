package com.example.demo.controller;

import com.example.demo.scope.RequestScopeBean;
import com.example.demo.scope.SessionScopeBean;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestScopeTestController {

    private final RequestScopeBean requestScopeBean;
    private final SessionScopeBean sessionScopeBean;

    @GetMapping("/scope/request")
    public String getRequestScopeTest() {
        return "name of source bean: " + requestScopeBean.getName() + ",\n"
                + "hashcode of proxy bean: " + requestScopeBean.hashCode();
    }

    @GetMapping("/scope/session")
    public String getSessionScopeTest() {
        return "name of source bean: " + sessionScopeBean.getName() + ",\n"
                + "hashcode of proxy bean: " + sessionScopeBean.hashCode();
    }
}
