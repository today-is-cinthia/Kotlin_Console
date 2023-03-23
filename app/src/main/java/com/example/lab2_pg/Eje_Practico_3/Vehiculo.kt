package com.example.lab_2_kotlin.Eje_Practico_3

enum class Tipo_Vehiculo{
    AUTOMOVIL, TRACTOR, BUS, CAMIONETA
}

class Vehiculo(var marca: String, var capacidad: Int, var tipo: Tipo_Vehiculo, var estado_Vehiculo: Boolean) {
    init {
        println("Marca: ${marca} \nCapacidad: ${capacidad} personas \nTipo vehiculo: ${Tipo_Vehiculo.AUTOMOVIL}")
    }

    fun encender(){
        estado_Vehiculo = true
    }
    fun apagar(){
        estado_Vehiculo = false
    }
    fun getEstadoVehiculo():String{
        if (estado_Vehiculo == true){
            return "ENCENDIDO"
        }
        return "APAGADO"
    }
    fun setEstadoVehiculo(estadoNuevo:Boolean): Boolean{
        estado_Vehiculo = estadoNuevo
        return estado_Vehiculo
    }
}