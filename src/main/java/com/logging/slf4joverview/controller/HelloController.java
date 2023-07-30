package com.logging.slf4joverview.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        LOGGER.info("Logging from controller on hello method");
        return new ResponseEntity<>("Log Test", HttpStatus.OK);
    }
}
