package com.example.lab2_pg

fun main()
{
    val num = arrayOf<Int>(1, 2, 3, 4, 5, 6, 2, 4,6)
    val set = mutableSetOf<Int>()

    for (i in num.indices)
    {
        println("Elemento [${i}] = ${num[i]}")
    }
    for (j in num)
    {
        if (!set.add(j)) {
            println("Elemento duplicado: $j")
        }
    }
}