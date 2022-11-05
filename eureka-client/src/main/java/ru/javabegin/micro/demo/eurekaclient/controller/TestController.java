package ru.javabegin.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test rest controller is ok 200. Response from eureka client rest controller";
    }
}
