package com.nadila.basickotlin

fun main(){
    luaspersegipanjang(3,4)
    luaspersegipanjang(6,4)
    var age : Byte = 19
    var height = 189
    var distance : Short = 10000
    var panjang = 3000000000L

    println(age)
    println(height)
    println(distance)
    println(panjang)
}

fun luaspersegipanjang( panjang : Int , Lebar : Int){
    val luas = panjang*Lebar
    println("luas persegi panjang adalah $luas")

}