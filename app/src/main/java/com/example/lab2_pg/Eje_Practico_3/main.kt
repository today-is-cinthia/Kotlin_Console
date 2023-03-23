package com.example.lab_2_kotlin.Eje_Practico_3


fun main()
{
    println("\n-------- Cinthia Duarte y Yender Martinez ---------")
    println("------------------ Ejercicio 3 ------------------\n")

    var vehiculo1 = Vehiculo("Toyota", 4, Tipo_Vehiculo.AUTOMOVIL, false)
    vehiculo1.setEstadoVehiculo(true)
    println("Estado: ${vehiculo1.getEstadoVehiculo()}\n")

    var vehiculo2 = Vehiculo("Nissan", 6, Tipo_Vehiculo.CAMIONETA, true)
    vehiculo2.setEstadoVehiculo(false)
    println("Estado: ${vehiculo2.getEstadoVehiculo()}.")
}

