package com.example.lab2_pg

fun main()
{
    var num : Int = 360
    println("Este programa muestra los numeros del 320 al 160 hacia atras de 20 en 20")

    for (i in (360 downTo  160) step  20) {
        println(i)
    }
}