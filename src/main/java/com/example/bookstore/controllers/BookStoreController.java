package com.example.bookstore.controllers;

import com.example.bookstore.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore")
public class BookStoreController {

    @GetMapping
    public ResponseEntity<String> helloTwitch() {
        return ResponseEntity.ok("Hello Twitch");
    }

//    @GetMapping
//    public ResponseEntity<Order> putAndOrder() {
//
//    }
}
