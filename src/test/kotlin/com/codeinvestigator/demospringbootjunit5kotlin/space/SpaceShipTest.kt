package com.codeinvestigator.demospringbootjunit5kotlin.space

import org.junit.jupiter.api.*
import org.springframework.boot.test.context.SpringBootTest
import java.util.concurrent.TimeUnit

@SpringBootTest
@Tag("fast")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SpaceShipTest {

    @AfterAll
    fun cleanupAfterAlltests(){
        println("Clean up after all tests. Sweep sweeep ")
    }

    @BeforeEach
    fun initSomeStuffBeforeeachFunction(){
        println("Do this before each function")
    }

    @Test
    @DisplayName("Prepare and launch our falcon spaceship")
    fun tryLaunchSpaceShip(){
        Thread.sleep(10000)
        println("Spaceship is launched roooaaraaa")
    }

    @Test
    @Disabled
    @DisplayName("Out cube spaceship is not yet ready!")
    fun tryLaunch2ndSpaceShip(){
        println("2nd Spaceship is launched roaaaaaooooaaaaooaaraaa")
    }
}