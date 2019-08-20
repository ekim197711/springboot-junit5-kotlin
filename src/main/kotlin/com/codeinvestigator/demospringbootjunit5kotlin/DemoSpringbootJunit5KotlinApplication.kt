package com.codeinvestigator.demospringbootjunit5kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringbootJunit5KotlinApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringbootJunit5KotlinApplication>(*args)
}
