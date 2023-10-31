package com.example.kotlinbasic.Chap05.sec01

fun main() {
    val s: String? = null
    println(strLenFun(s))
    println(strLenFun("Kotlin"))
}

fun strLenFun(str: String?): Int =
    str?.length ?:0