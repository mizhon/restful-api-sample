package com.demo.restfulapisample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 */

@RestController
public class HealthyController {

    @GetMapping(value = "/health")
    public String checkHealth() {
        return "Hi, service is healthy!";
    }
}
