package com.example.kotlinbasic.chap01.sec02

fun main() {
    checkArgs( "Kotlin")
    checkArgs( 100);
    checkArgs( 100.0);
}
fun checkArgs(type: Any){
    when(type){
        is String -> println("Type is string : $type")
        is Int -> println("Type is Int : $type")
        is Double -> println("Type is Double : $type")
    }
}