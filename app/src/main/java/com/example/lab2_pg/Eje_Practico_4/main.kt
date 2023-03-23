package com.example.lab_2_kotlin.Eje_Practico_4

fun main()
{
    val lib = Libreria("Santiago", "Jinotepe")

    println("\n-------- Cinthia Duarte y Yender Martinez ---------")
    println("------------------ Ejercicio 4 ------------------\n")

    lib.bienvendida()

    if (lib.abierto == false){
        println("La librería está cerrada")
    }

    println("\n-------- Método override --------")
    println(lib.toString())
}