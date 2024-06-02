package com.jtsp.orderservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final List<String> orders = Arrays.asList(
            "iphone15",
            "ipad pro",
            "apple watch"
    );

    @GetMapping
    public ResponseEntity<List<String>> getOrders() {
        return  ResponseEntity.ok(orders);
    }
}
