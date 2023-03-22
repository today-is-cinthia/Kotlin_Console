package com.example.lab2_pg.ej20

import kotlin.math.PI

abstract class Figura(val nombre: String){
    abstract fun area(): Double
}
class Triangulo(val base: Double, val altura: Double) : Figura("TrianguloRectangulo") {
    override fun area(): Double = base * altura / 2
}
class Cuadrado(val lado: Double) : Figura("Cuadrado") {
    override fun area(): Double = lado * lado
}

class Circulo(val radio: Double) : Figura("Circulo") {
    override fun area(): Double = PI * radio * radio
}

class Rectangulo(val base: Double, val altura: Double) : Figura("Rectangulo") {
    override fun area(): Double = base * altura
}

