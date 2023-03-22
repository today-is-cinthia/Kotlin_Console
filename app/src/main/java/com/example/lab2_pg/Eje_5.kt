package com.example.lab2_pg

fun main()
{
    var hora: Int

    print("Ingrese la hora en sistema militar (0-24 horas) : ")
    hora = readln().toInt()

    if (hora >= 6 && hora <=12)
        println("Buenos dias")
    else if(hora >=13 && hora <=18)
        println("Buanas tardes")
    else
        println("Buenas noches")

}