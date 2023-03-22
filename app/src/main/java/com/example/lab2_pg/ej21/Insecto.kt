package com.example.lab2_pg.ej21

class Insecto(    private val longitud: Float,
                  private val numAlas: Int,
                  private val numPatas: Int,
                  private val color: String,
                  private val numAntenas: Int,
                  private val tipoInsecto: String
) {
    fun imprimir() {
        println("Longitud: $longitud cm")
        println("Número de alas: $numAlas")
        println("Número de patas: $numPatas")
        println("Color: $color")
        println("Número de antenas: $numAntenas")
        println("Tipo de insecto: $tipoInsecto")

    }}