package com.example.sagapattern

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SagaPatternApplication

fun main(args: Array<String>) {
    runApplication<SagaPatternApplication>(*args)
}
