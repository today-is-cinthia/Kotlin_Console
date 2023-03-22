package com.example.lab2_pg.ej19

class Persona(val nombres: String, val apellidos: String, val cedula: String, val sexo: String, val anioNacimiento: String) {

    fun imprimir()
    {
        println("$nombres $apellidos - $cedula - $sexo - $anioNacimiento")
    }

}
