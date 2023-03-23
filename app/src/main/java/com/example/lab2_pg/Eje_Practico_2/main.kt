package com.example.lab_2_kotlin.Eje_Practico_2

 data class SuperHeroe(var personaje: String, var pelicula: String,
                       var nombre_Real: String, var anio_Publicacion: Int)

 data class SuperHeroeInmutable(val personaje: String, val pelicula: String,
                                val nombre_Real: String, val anio_Publicacion: Int)


fun main()
{
    var heroe_1 = SuperHeroe("Hulk", "El increible Hulk", "Bruce Banenr", 2008)

    println("\n-------- Cinthia Duarte y Yender Martinez ---------")
    println("------------------ Ejercicio 2 ------------------\n")

    println("DATA CLASE -------------------")
    println("Personaje principal: ${heroe_1.personaje}\nPelicula: ${heroe_1.pelicula}")
    println("Nombre real: ${heroe_1.nombre_Real}\nAño de publicacion: ${heroe_1.anio_Publicacion}.")

    heroe_1.personaje = "Capitan America"
    heroe_1.pelicula = "Capitan America Civil War"
    heroe_1.nombre_Real = "Chis Evans"
    heroe_1.anio_Publicacion = 2016

    println("MUTABLE -------------------")
    println("Personaje principal: ${heroe_1.personaje}\nPelicula: ${heroe_1.pelicula}")
    println("Nombre real: ${heroe_1.nombre_Real}\nAño de publicacion: ${heroe_1.anio_Publicacion}.")

    /* lista mutable de la data class SuperHeroeInmutable */
    var lista: MutableList<SuperHeroeInmutable> = mutableListOf()

    lista.add(SuperHeroeInmutable("Goku", "Dragon Ball", "Kakaroto", 1998))
    lista.add(SuperHeroeInmutable("Linterna verde", "Linterna verde", "Hal Jordan", 2011))
    lista.add(SuperHeroeInmutable("Ant-Man", "Ant-Man", "Scott Lang", 2015))
    lista.add(SuperHeroeInmutable("Iron Man", "Iron Man", "Anthony Stark", 2008))

    println("\nLa cantidad de elementos en la lista mutable es: ${lista.size}.")
    println("El primer elemento de la lista es: ${lista.first()}.")
    println("El segundo elemento de la lista es: ${lista[2]}.")
    println("El último elemento de la lista es: ${lista.last()}.\n")

    for (heroe in lista){
        println("Personaje: ${heroe.component1()}\t\t\t\t\t\t\tPelícula: ${heroe.component2()}")
    }
}