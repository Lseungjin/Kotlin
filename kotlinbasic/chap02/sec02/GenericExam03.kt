package com.example.kotlinbasic.chap02.sec02

fun<T: Number> getSum(num1: T, num2: T): T{
    /**매개변수 num1, num2를 double 타입으로 변환하여 연산하고
    반환값은 제너릭 타입으로 변환하여 반환
     */
    return (num1.toDouble() + num2.toDouble()) as T
}

fun main() {
    println(getSum(10, 20))
    println(getSum(10.0f, 20.0f))
    println(getSum(10.0, 20.0))
}