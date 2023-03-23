package com.example.lab_2_kotlin.Eje_Practico_5

open class Persona(val Nombre: String, val Apellido: String) {
    var tipoPersona:String = ""

    fun getNombreCompleto():String = "$Nombre $Apellido"

    open fun showTipoPersona():String {
        return "Desconocido."
    }
}