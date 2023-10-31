package com.example.kotlinbasic.chap07.sec02

import com.example.kotlinbasic.Chap06.sec02.f1

fun main() {
    var result = f1(100, 100)
    println(result)
}
fun f1(a1: Int, a2: Int): Int{
    var count = a1 + a2
    return count
}