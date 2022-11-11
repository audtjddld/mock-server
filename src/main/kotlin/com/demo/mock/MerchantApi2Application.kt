package com.demo.mock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class MerchantApi2Application {

    @GetMapping(path = ["/merchant2/{id}"])
    fun merchant(request: String?, @PathVariable("id") id: Long): String {
        println("called merchant 2")
        return "$id merchant2"
    }
}

fun main(args: Array<String>) {
    System.setProperty("server.port", "9092")
    runApplication<MerchantApi2Application>(*args)
}


