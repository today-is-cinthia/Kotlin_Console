package com.example.lab2_pg

fun main()
{
    var lista = arrayOf(8)
    var num1: Int?
    var num2: Int?
    var num3: Int?

    print("Digite el primer numero: ")
    num1 = readLine()?.toIntOrNull()!!
    print("Digite el segundo numero: ")
    num2 = readLine()?.toIntOrNull()!!
    print("Digite el tercer numero: ")
    num3 = readLine()?.toIntOrNull()!!

    Ordenar_Num(num1 , num2, num3)

}

fun Ordenar_Num(num1: Int, num2: Int, num3: Int)
{
    var juntar = "$num1 $num2 $num3 "
    var ordenar = juntar.toSortedSet()
    println("Los numeros ordenados quedan asi: $ordenar")
}