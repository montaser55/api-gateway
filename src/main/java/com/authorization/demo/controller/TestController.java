package com.authorization.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/api")
public class TestController {


    @GetMapping("/")
    public String getBody() {
        return "Test";
    }

}
