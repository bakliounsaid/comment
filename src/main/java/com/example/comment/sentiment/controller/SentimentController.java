package com.example.comment.sentiment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentiment")
public class SentimentController {
    @GetMapping("test")
    public String test() {
        return "Hello from SentimentController";
    }
}