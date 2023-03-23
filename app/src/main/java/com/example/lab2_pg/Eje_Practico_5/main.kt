package com.example.lab_2_kotlin.Eje_Practico_5

fun main()
{
    val cliente = Cliente("Cinthia", "Duarte Ruiz", 85542590)
    val colaborador = Colaborador("Yender", "Martinez", 0)

    println("\n-------- Cinthia Duarte y Yender Martinez ---------")
    println("------------------ Ejercicio 5 ------------------\n")

    println("Clase Cliente ---------------")
    println(cliente.showTipoPersona())
    println(cliente.getNombreCompleto())
    println(cliente.getCliente())

    println("\nClase Colaborador ----------------")
    println(colaborador.showTipoPersona())
    println(colaborador.getNombreCompleto())
}



