package com.demo.restfulapisample.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 */

@RestController
public class HealthyController {

    Logger logger = LoggerFactory.getLogger(HealthyController.class);

    @GetMapping(value = "/health")
    public String checkHealth() {
        logger.info("-----------> testing ...");
        return "Hi, service is healthy!";
    }
}
