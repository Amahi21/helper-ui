package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import java.io.File
import com.example.common.Currensies

fun Application.configureRouting() {

    routing {
        static("/") {
            defaultResource("index.html")
        }
        get("/sum") {
            val first = Currensies(call.request.queryParameters["amountRUB"]?.toDouble())
            call.respondText("USD - ${first.usd}\n" +
                                  "EUR - ${first.eur}\n" +
                                  "JPY - ${first.jpy}")
        }
    }
}
