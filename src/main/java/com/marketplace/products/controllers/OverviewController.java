package com.marketplace.products.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class OverviewController {

    @GetMapping
    public ResponseEntity<Map<String,String>> findOne() {
        Map<String,String> response  = new LinkedHashMap<>();
        response.put("hello","World");

        return ResponseEntity.ok(response);
    }
}
