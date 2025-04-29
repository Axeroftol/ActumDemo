package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello1")
    public String helloActum() {
        return "Hello Actum!";
    }

    @GetMapping("/hello2")
    public String helloGrohe() {
        return "Hello Grohe!";
    }

    @PostMapping("/submit")
    public String submitData(@RequestBody String body) {
        return "Received: " + body;
    }
}
