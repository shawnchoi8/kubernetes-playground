package com.sh.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        System.out.println("Hello World!"); // for debugging
        return "Hello World!";
    }
}
