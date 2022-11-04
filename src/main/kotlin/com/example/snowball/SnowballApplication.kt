package com.example.snowball

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SnowballApplication

fun main(args: Array<String>) {
    runApplication<SnowballApplication>(*args)
}
