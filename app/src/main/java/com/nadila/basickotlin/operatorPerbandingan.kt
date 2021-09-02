package com.nadila.basickotlin

fun main(){
    val a = 4
    val b = 6

    println("a > b is ${a >b}")
    println("a = b is ${a == b}")
    // hasilnya akan boolean (true,false)

    val nilai = 87
    if(nilai <= 90){
        println("You get score A")
    } else if(nilai >=  75){
        println("You get score B")
    } else { // jika pake else udah mentok.
        println("You don't get score")
    }
}
