package com.codeinvestigator.demospringbootjunit5kotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoSpringbootJunit5KotlinApplicationTests {

    @Test
    fun contextLoads() {
        println("WE are testing the CONTEXT!!!!")
    }

}
