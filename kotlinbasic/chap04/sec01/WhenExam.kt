package com.example.kotlinbasic.chap04.sec01

fun main() {
    var x = 3

    when(x) {
        1 -> {
            println("x == 1")
        }
        2 -> {
            println("x == 2")
        }
        3 ->{
            println("x == 3")
        }
        else ->{
            println("x는 1,2,3,가 아니다!")
        }
    }
    when(x){
        0, 1 -> {
            println("x == 0 or 1")
        }
        2,3 ->{
            println("x == 2 or 3")
        }
        else ->{
            println("x는 1,2,3이 아니다!")
        }
    }
}