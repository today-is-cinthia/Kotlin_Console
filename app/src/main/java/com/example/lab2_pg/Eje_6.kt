package com.example.lab2_pg

fun main()
{
    var num : Int?

    print("Digite un numero del 1 al 7: ")
    num = readLine()?.toIntOrNull()

    when(num)
    {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Opcion fuera del rango indicado")
    }


}