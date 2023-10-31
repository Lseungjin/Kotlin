package com.example.kotlinbasic.Chap05.sec01

fun strAllCaps(str: String?){
    var strCaps: String? = str?.uppercase()
    println(strCaps)
}
fun main() {
    strAllCaps(null)
    strAllCaps("Kotlin")
}