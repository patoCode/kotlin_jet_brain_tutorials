package com.f5.plugins

import com.f5.route.customerRouting
import com.f5.route.orderRoutes
import com.f5.route.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        orderRoutes()
        totalizeOrderRoute()
    }
}
