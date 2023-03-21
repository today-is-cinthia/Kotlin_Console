package com.example.lab2_pg

import java.util.*


fun main()
{
    var i = 1
    var suma = 0
    val n1: Int
    val n2: Int
    val sc = Scanner(System.`in`)
    print("Introduce primer número: ")
    n1 = sc.nextInt()
    print("Introduce segundo número: ")
    n2 = sc.nextInt()

    while (i < n1)
    {
        if (n1 % i == 0)
        {
            suma += i
        }
        i += 1
    }
    if (suma == n2)
    {
        println("Los números son amigos")
    }
    else
    {
        println("Los números no son amigos")
    }
}