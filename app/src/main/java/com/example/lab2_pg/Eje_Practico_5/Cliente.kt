package com.example.lab_2_kotlin.Eje_Practico_5

class Cliente(Nombre: String, Apellido: String, telefono:Int) : Persona(Nombre, Apellido){
    private var telefono:Int = 0

    init {
        this.telefono = telefono
    }

    fun getCliente(): String{
        return "Datos del cliente:  Telf. $telefono\tNombre: $Nombre $Apellido"
    }

    override fun showTipoPersona(): String {
        return "Cliente ...."
    }
}