package com.example.snowball.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun healthy(): String? {
        return "hi this is 연금스노우볼~"
    }
}