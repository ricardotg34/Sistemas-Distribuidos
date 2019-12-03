package com.ricardotg.articulomovil

import java.io.StringReader
import javax.json.Json
import javax.json.JsonArray
import javax.json.JsonObject
import javax.json.JsonReader


class Articulo(
    var claveArticulo: String,
    var descripcion: String,
    var precio: Double,
    var existencias: Integer
){

}

fun getArticuloList(jsonList:String): List<Articulo> {
    val jsonReader: JsonReader = Json.createReader(StringReader(jsonList))
    val obj = jsonReader.readObject()
    val list: JsonArray = obj.getJsonArray("results")
    val job: JsonObject = list.getJsonObject(0)
    val articulos = ArrayList<Articulo>()
    for (jv in list) {
        val claveArticulo: String = jv.asJsonObject().getJsonString("claveArticulo").getString()
        val descripcion: String = jv.asJsonObject().getJsonString("descripcion").getString()
        val precio: String = jv.asJsonObject().getJsonString("precio").getString()
        val existencias: Integer = jv.asJsonObject().getJsonNumber("existencias").intValue() as Integer
        articulos
            .add(Articulo(claveArticulo, descripcion, precio.toDouble(), existencias))
    }
    jsonReader.close()
    return articulos
}