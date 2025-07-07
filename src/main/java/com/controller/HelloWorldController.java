package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // http://localhost:9000/HelloWorld
    // http://localhost:9000/HelloWorld?name=Pablo
    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(value = "name", defaultValue = "Unknown") String name) {
        return String.format("Hello %s! \n" +
                "You are running a Maven project", name);
    }

    // http://localhost:9000/HelloWorld2
    // http://localhost:9000/HelloWorld2/Pablo
    @GetMapping("/HelloWorld2/{name}")
    public String hello2(@PathVariable String name) {
        return String.format("Hello %s! \n" +
                "You are running a Maven project", name);
    }
}