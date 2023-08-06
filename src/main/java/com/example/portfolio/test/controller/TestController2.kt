package com.example.portfolio.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test2")
class TestController2 {

    @GetMapping
    fun test(): String{
        return "test2"
    }
}