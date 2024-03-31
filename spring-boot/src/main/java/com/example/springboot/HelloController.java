package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //it will handle incoming web requests and return the response directly
public class HelloController {

    @GetMapping("/") //maps HTTP GET requests to the root URI("/"), get requests will imply this method
    public String index() {
        return "Greetings from Spring Boot!";
    }

}