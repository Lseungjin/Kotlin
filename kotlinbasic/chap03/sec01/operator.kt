package com.example.kotlinbasic.chap03.sec01

fun main() {
    /*산술연산자
    1. a + b : a.plus(b)
    2. a - b : a. minus(b)
    3. a * b : a.times(b)
    4. a / b : a.div(b)
    5. a % b : a.rem(b)
     */

    var a = 10; var b = 20
    println("a, b : ${a}, ${b}")
    println("a+b: ${a+b}")
    println("a.plus(b): ${a.plus(b)}")

    println("a-b : ${a-b}")
    println("a.minus(b) : ${a.minus(b)}")

    println("a*b : ${a*b}")
    println("a.times(b) : ${a.times(b)}")

    println("b/a : ${b/a}")
    println("b.div(a): ${b.div(a)}")

    println("b%a: ${b%a}")
    println("b.rem(a: ${b.rem(a)}")

}