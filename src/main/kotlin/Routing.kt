package com

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        get("/") {
            call.respondText("Backend GAT funcionando en Railway")
        }

        // Vista principal: Administradora
        route("/admin") {

            get {
                call.respondText("Vista principal: Administradora del backend")
            }

            post {
                call.respondText("Administrador registrado de prueba")
            }
        }

        // Rama 1
        route("/rama1") {

            get {
                call.respondText("Rama 1: módulo de usuarios conectado al backend")
            }

            post {
                call.respondText("Rama 1: usuario registrado de prueba")
            }
        }

        // Rama 2
        route("/rama2") {

            get {
                call.respondText("Rama 2: módulo de reportes conectado al backend")
            }

            post {
                call.respondText("Rama 2: reporte generado de prueba")
            }
        }
    }
}