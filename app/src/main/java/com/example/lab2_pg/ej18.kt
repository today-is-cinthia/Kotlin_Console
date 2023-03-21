package com.example.lab2_pg


fun main()
{
    var indice = 0

    val arreglo = arrayOf(1, 5, 1, 5, 8, 3, 6)

    println("Elementos del array")
    for(i in arreglo)
    {
        println("Elemento [$indice] = $i")
        indice += 1
    }


}