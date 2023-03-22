package com.example.lab2_pg
import kotlin.math.*

const val PI: Float = 3.1416f

fun main()
{
    var radio: Float?

    print("Digite el radio del circulo: ")

    var resultado = calcularArea_Circulo(radio = readLine()?.toFloatOrNull()!!)
    println("El area del circulo es: $resultado")
}

fun calcularArea_Circulo(radio: Float ) : Float
{
    var area = PI * radio.pow(2)
    return area
}