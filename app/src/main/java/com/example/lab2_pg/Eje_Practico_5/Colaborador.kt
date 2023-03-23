package com.example.lab_2_kotlin.Eje_Practico_5

class Colaborador(Nombre: String, Apellido: String, var cant_Hijos: Short) : Persona(Nombre, Apellido){

    override fun showTipoPersona(): String {
        return "Coalaborador ....."
    }
}