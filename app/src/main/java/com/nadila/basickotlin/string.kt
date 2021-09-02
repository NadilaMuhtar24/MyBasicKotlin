package com.nadila.basickotlin

fun main (){
    val basmallah = "Bismillah"
    for (b in basmallah) {
        println(b)
    }

    /** pemggabungan 2 variable string
     * bisa menggunakan tanda + */
    val karakterPertama = basmallah[0]
    val karakterTerakhir = basmallah[8]
    val lastChar = basmallah.last()

    val supr = "Nadila" + 19
    println(supr + "Muhtar")

    // memanggil var didalam string
    val n = "Ilala"
    println("$n.length is ${n.length}")

}