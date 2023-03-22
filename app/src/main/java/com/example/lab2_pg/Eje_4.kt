package com.example.lab2_pg

fun main()
{
    val espanol = arrayOf<String>("Naranja", "Verde", "Azul", "Crema", "Rojo", "Morado", "Negro", "Rosado", "Gris", "Blanco")
    val ingles = arrayOf<String>("Orange", "Green", "Blue", "Cream", "Red", "Purple", "Black", "Pink", "Grey", "White")

    for (i in espanol.indices)
    {
        println("${espanol[i]}\t\t\t\t\t\t${ingles[i]}")
    }
}
