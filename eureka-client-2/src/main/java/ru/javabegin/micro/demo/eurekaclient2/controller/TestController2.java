package ru.javabegin.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new") //root URI
public class TestController2 {

    @GetMapping("/name")
    public String name() {
        return "response from e client service - 2! Hello world!!!";
    }
}
