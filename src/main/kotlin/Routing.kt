package com

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        get("/") {
            call.respondText("Backend GAT funcionando en Railway")
        }

        route("/traslados") {

            get {
                call.respondText("Lista de traslados registrados")
            }

            post {
                call.respondText("Traslado registrado correctamente")
            }

            get("/estado") {
                call.respondText("Estado del traslado: pendiente de confirmación")
            }
        }
    }
}