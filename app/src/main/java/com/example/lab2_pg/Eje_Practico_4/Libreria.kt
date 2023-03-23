package com.example.lab_2_kotlin.Eje_Practico_4

class Libreria(var nombre: String, var direccion: String,
               var telefono: Byte = 0, var colaboradores: Byte = 0, var abierto: Boolean = true) {

    fun bienvendida(){
        println("Bienvenido")
    }

    override fun toString():String{
        return ("Libreria: $nombre se ubica en: $direccion")
    }
}