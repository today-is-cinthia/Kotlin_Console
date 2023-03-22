package com.example.lab2_pg

fun main()
{
    var salario: Float
    var horas: Int?

    println("Digite las horas que trabajo esta semana: ")
    horas = readLine()?.toIntOrNull()!!

    salario = horas.toFloat() * 12

    println("Usted gano esta semana $ $salario")

}
