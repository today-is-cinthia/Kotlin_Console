package com.example.lab2_pg

fun main()
{
    var horas: Int?

    print("Ingrese el total de horas trabajadas en una semana: ")
    horas = readLine()?.toIntOrNull()!!

    if(horas <= 40)
    {
        var pago1: Int = horas * 12
        println("usted gano $ $pago1 esta semana")
    }
    else if(horas > 40)
    {
        var a: Int = horas - 40
        var pago2 = a * 16
        println("Usted gano $ ${pago2 + 40 * 12 } esta semana")
    }

}