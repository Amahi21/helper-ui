package com.example.plugins

import io.ktor.serialization.jackson.*
import com.fasterxml.jackson.databind.*
import io.ktor.server.plugins.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import com.example.common.Currensies
import io.ktor.server.plugins.cors.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }
    install(CORS) {
        anyHost()
    }

    routing {
        get("/json/sum") {
            val cur = Currensies(call.request.queryParameters["amountRUB"]?.toDouble())
            call.respond(cur)
//            call.respondText(cur.usd.toString())
        }
    }
}
