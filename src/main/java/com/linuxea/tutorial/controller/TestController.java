package com.linuxea.tutorial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    private final HttpServletRequest httpServletRequest;

    @Autowired
    public TestController(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @GetMapping
    public Map<String, String[]> helloHttpServletRequest() {
        return httpServletRequest.getParameterMap();
    }

}
