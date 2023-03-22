package com.example.lab2_pg

fun main()
{
    var base: Int = 0
    var altura: Int = 0

    print("Digite la base del triangulo: ")
    base = readln().toInt()
    print("Digite la altura del triangulo: ")
    altura = readln().toInt()
    var resultado = calcularArea(base, altura)
    println("El area del triangulo es: $resultado")
}

fun calcularArea(base: Int , altura : Int) : Float
{
    var area = (base.toFloat() * altura.toFloat())/2
    return area
}

