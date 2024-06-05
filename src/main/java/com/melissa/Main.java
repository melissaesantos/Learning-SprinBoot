package com.melissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//needed for get,post,..mapping will be exposed as rest endpoints that clients can call
@RestController
public class Main {
    // inorder for this to be a spring boot application we have to add a couple of things

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//rest endpoint that clients can use as get requests
    @GetMapping("/")
    public String greet(){
        return "Hello";
    }
}
