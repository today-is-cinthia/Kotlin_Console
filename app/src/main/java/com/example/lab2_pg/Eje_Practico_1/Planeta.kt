package com.example.lab_2_kotlin.Eje_Practico_1

enum class TipoPlaneta {
    terrestre, gaseoso, enano
}

class Planeta constructor(var nombre: String, var satelites: Int, var masa: Double,
                          var volumen: Double, var distancia_sol: Int, var tipo_planeta: TipoPlaneta)
{
    val distancia_media_sol: Int = 149597870

    init {
        println("\n-------- Cinthia Duarte y Yender Martinez ---------")
        println("------------------ Ejercicio 1 ------------------\n")
        println("Nombre del planeta: ${nombre} \nSatelites: ${satelites} ")
        println("Tipo de Planeta: ${tipo_planeta} \nMasa Kg: ${masa}  \nVolumen Kg: ${volumen}")
        println("Distancia media: ${distancia_sol} km.")
    }

    fun Obtener_Densidad():Double {
        return (masa / volumen)
    }

    fun esExterior(): String {
        if (distancia_sol > distancia_media_sol){
            return "exterior"
        }
        else{
            return "uno no exterior"
        }
    }
}