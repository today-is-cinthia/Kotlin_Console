package com.example.lab2_pg
import java.util.Scanner

fun main()
{
    val reader = Scanner(System.`in`)
    print("Digite un numero: ")
    ej11(reader.nextInt())
}

fun  ej11(num: Int) {
    for (i in 1..10)
    {
        val m = num.times(i)
        println("$num * $i =  $m")
    }
}