package com

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.configureRouting() {

    routing {


        // Endpoint de prueba Railway
        get("/") {

            call.respondText(
                "Backend GAT funcionando correctamente en Railway"
            )

        }


        // ===============================
        // RAMA PRINCIPAL - ADMINISTRADORA
        // ===============================

        route("/admin") {


            get {

                call.respondText(
                    "Vista Principal: Administradora conectada al Backend"
                )

            }


            post {

                call.respondText(
                    "Administrador registrado correctamente"
                )

            }

        }



        // ===============================
        // RAMA 1 - USUARIOS
        // ===============================

        route("/rama1") {


            get {

                call.respondText(
                    "Rama 1 funcionando: Gestion de usuarios"
                )

            }


            post {

                call.respondText(
                    "Usuario registrado correctamente"
                )

            }

        }



        // ===============================
        // RAMA 2 - REPORTES
        // ===============================

        route("/rama2") {


            get {

                call.respondText(
                    "Rama 2 funcionando: Gestion de reportes"
                )

            }


            post {

                call.respondText(
                    "Reporte generado correctamente"
                )

            }

        }

    }

}