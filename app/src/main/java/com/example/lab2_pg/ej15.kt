package com.example.lab2_pg


fun main()
{
    val arreglo = arrayOf(90, 65, 80, 45, 87, 30, 38, 63, 98, 70)
    var suma = 0
    for (i in arreglo)
    {
        suma+=i
    }
    println("Suma de los elementos = $suma \n Promedio de todos los elementos = ${suma.div(arreglo.size)}")
}


