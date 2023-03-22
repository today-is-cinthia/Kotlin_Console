package com.example.lab2_pg.ej222

fun main()
{
    var clase : MutableList<Clase> = mutableListOf()

    clase.add(Clase("Glenda Barrios", "PG", 10, 10))
    clase.add(Clase("Hilda Saavedra", "Teoria de la computación", 5, 7))

    for (i in clase)
    {
        println("Profesor: ${i.component1()}\n Materia: ${i.component2()}\n Laboratorios: ${i.component3()}\n Conferencias: ${i.component4()} ")
    }
}
