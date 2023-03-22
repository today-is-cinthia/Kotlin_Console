package com.example.lab2_pg.ej20

fun main() {

    val figura1 = Circulo(1.0)
    val figura2 = Rectangulo(1.0, 2.0)
    val figura3 = Cuadrado(3.0)
    val figura4 = Triangulo(3.0, 5.0)

    println("${figura1.nombre}: Radio ${figura1.radio} Área ${figura1.area()}")
    println("${figura2.nombre}: Base ${figura2.base} Altura ${figura2.altura} Área ${figura2.area()}")
    println("${figura3.nombre}: Lado ${figura3.lado} Área ${figura3.area()}")
    println("${figura4.nombre}: Base ${figura4.base} Altura ${figura4.altura} Área ${figura4.area()}")
}