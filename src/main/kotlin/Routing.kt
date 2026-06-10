package com

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.configureRouting() {

    routing {


        // Endpoint principal para comprobar Railway
        get("/") {

            call.respondText(
                "Backend GAT funcionando correctamente en Railway"
            )

        }


        // ==============================
        // ENDPOINTS ADMINISTRADOR
        // ==============================


        route("/admin") {


            // Consultar administradores
            get {

                call.respondText(
                    "Lista de administradores"
                )

            }


            // Crear administrador
            post {

                call.respondText(
                    "Administrador registrado correctamente"
                )

            }


            // Actualizar administrador
            put("/{id}") {

                val id = call.parameters["id"]

                call.respondText(
                    "Administrador con ID $id actualizado"
                )

            }


            // Eliminar administrador
            delete("/{id}") {

                val id = call.parameters["id"]

                call.respondText(
                    "Administrador con ID $id eliminado"
                )

            }

        }



        // ==============================
        // GESTION DE USUARIOS
        // ==============================


        route("/usuarios") {


            // Obtener usuarios
            get {

                call.respondText(
                    "Lista de usuarios del sistema"
                )

            }


            // Crear usuario
            post {

                call.respondText(
                    "Usuario creado correctamente"
                )

            }


            // Actualizar usuario
            put("/{id}") {

                val id = call.parameters["id"]

                call.respondText(
                    "Usuario con ID $id actualizado"
                )

            }


            // Eliminar usuario
            delete("/{id}") {

                val id = call.parameters["id"]

                call.respondText(
                    "Usuario con ID $id eliminado"
                )

            }

        }




        // ==============================
        // REPORTES DEL ADMINISTRADOR
        // ==============================


        route("/reportes") {


            // Reporte general
            get {

                call.respondText(
                    "Reporte general del sistema"
                )

            }


            // Reporte de traslados
            get("/traslados") {

                call.respondText(
                    "Reporte de traslados realizados"
                )

            }


            // Reporte de unidades
            get("/unidades") {

                call.respondText(
                    "Reporte de disponibilidad de unidades"
                )

            }

        }


    }

}