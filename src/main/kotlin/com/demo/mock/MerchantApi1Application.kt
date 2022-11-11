package com.demo.mock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class MerchantApi1Application {

    @GetMapping(path = ["/merchant1/{id}"])
    fun merchant1(request: String?, @PathVariable("id") id: Long): String {
        println("called merchant 1")
        return "$id merchant1"
    }
}

fun main(args: Array<String>) {
    System.setProperty("server.port", "9091")
    runApplication<MerchantApi1Application>(*args)
}
