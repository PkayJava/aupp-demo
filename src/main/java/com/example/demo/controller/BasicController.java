package com.example.demo.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @RequestMapping(path = "/")
    public ResponseEntity<String> hello(RequestEntity<String> httpRequest) {
        return ResponseEntity.ok("<h1>Hello World from CICD</h1>");
    }

}
