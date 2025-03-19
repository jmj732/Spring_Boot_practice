package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aController {
    @RestController
    public class MyRestController {

        @RequestMapping("/hello")
        public String hello() {
            return "Hello, World!";  // JSON 형식의 응답으로 자동 변환
        }
    }

}
