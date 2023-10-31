package com.example.kotlinbasic.chap07.sec03

class Customer(val id: Int, val name: String, val email: String)

fun main() {
    var isInitialized: Boolean = false

    val sony: Customer by lazy{
        println("Customer 객체 초기화")
        isInitialized = true

        Customer(1001, "손흥민", "sony@gmail.com")
    }

    println("초기화 여부 : $isInitialized")

    println("sony => id: ${sony.id}, name: ${sony.name}, email: ${sony.email}")

    println("초기화 여부 : $isInitialized")
}