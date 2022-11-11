package com.demo.mock

import java.util.Locale
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class AuthenticationApplication {

    @GetMapping("token")
    fun token(@RequestParam("token") token: String): ResponseEntity<String?> {
        println("token = $token")
        return if (token.lowercase(Locale.getDefault()).contains("error")) {
            ResponseEntity.badRequest().build()
        } else ResponseEntity.ok("ok")
    }
}

fun main(args: Array<String>) {
    System.setProperty("server.port", "9093")
    runApplication<AuthenticationApplication>(*args)
}

