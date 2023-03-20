package com.example.lab2_pg
import java.util.Scanner

fun main()
{
    val reader = Scanner(System.`in`)
    print("Digite la altura de la pramide: ")

    val alturainput = reader.nextInt()

    var altura = 1
    var espacios = alturainput - 1

    while(altura <= alturainput)
    {
        for (i in 1..espacios)
        {
            print(" ")
        }
        for (i in 1..altura)
        {
            print(i)
        }
        for (i in altura downTo 0)
        {
            print(i)
        }
        println()
        altura++
        espacios--
    }
}
