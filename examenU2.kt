package com.example.myapplication

import android.R

fun main () {
    val menu = """
        1. Registrar participante
        2. Registrar puntos
        3. Consultar participante
        4. Mostrar estadísticas del torneo
        5. Finalizar programa
        
        Seleccione una opción: 
    """.trimIndent()

    val Participantes = mutableListOf<String>()
    val Puntos = mutableListOf<Int>()

    fun addParticipante(nombre: String){
        Participantes.add(nombre)
        Puntos.add(0)
        return
    }

    fun addPuntaje(){

    }


    while (true){
        print(menu)
        var eleccion = readln()

        if (eleccion == "1") {
            while (true){
                print("Ingresa el nombre del patricipante: ")
                val nombre = readln()
                if (nombre.isBlank()) {
                    println("El nombre no puede estar  vacío")
                    continue
                } else {
                    addParticipante(nombre)
                    println("$nombre ha sido agregado con exito")
                    break
                }
            }
        }

        if (eleccion == "2") {

                println("Selecciona un participante usando su numero: ")
                for ((indice, participante) in Participantes.withIndex()) {
                    val numero = indice + 1
                    println("$numero. $participante")
                }
            while (true){
                val participante = readln().toInt() - 1
                val comprobarIndice = participante in 0 until Participantes.size
                if (comprobarIndice){
                    print("¿Cuantos puntos deseas sumar?: ")
                    val puntos = readln().toInt()
                    if (puntos)
                }

            }
        }

        if (eleccion == "3") {

        }

        if (eleccion == "4") {

        }

        if (eleccion == "5") {

        }
    }

}