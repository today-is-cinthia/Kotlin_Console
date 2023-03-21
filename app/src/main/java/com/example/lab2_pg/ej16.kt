package com.example.lab2_pg

fun main()
{
    val plus = {a:Int, b:Int, c:Int -> a+b+c}
    var resultado:Int = plus(58,78,36)
    println(resultado)
    val producto = {a:Int, b:Int, c:Int -> a*b*c}
    resultado = producto(58,78,36)
    println(resultado)
    val prom = {a:Int, b:Int, c:Int -> (a+b+c)/(3)}
    resultado = prom(58,78,36)
    println(resultado)
}
