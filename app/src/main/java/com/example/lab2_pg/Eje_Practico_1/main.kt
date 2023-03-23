package com.example.lab_2_kotlin.Eje_Practico_1

import java.text.DecimalFormat

fun main() {
    val dformat = DecimalFormat("#.####")

    val planeta: Planeta = Planeta("Marte", 2, 500.00, 800.00, 50, TipoPlaneta.terrestre)

    if (planeta.esExterior().toBoolean()) {
        println("Es un planeta Exterior")
    } else
        println("No es un planeta Exterior")
    println("La densisdad del planeta es: ${dformat.format(planeta.Obtener_Densidad())} ")
}