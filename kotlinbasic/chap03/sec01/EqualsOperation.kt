package com.example.kotlinbasic.chap03.sec01

import com.google.android.material.color.utilities.Score

fun main() {
    val v1: Int = 100;
    val v2: Int = 200;
    val v3: Int = 100
    println("v1 == v2 : ${v1 == v2}")
    println("v1.equals(v3) : ${v1.equals(v3)}")
    println("v1! = v2 : ${v1 != v2}")

    val obj1 = Score(100, 200);
    val obj2 = Score(300, 400)
    val obj3 = Score(100, 200)

    println("obj1 == obj2 : ${obj1 == obj2}")
    println("obj1 == obj3 : ${obj1 == obj3}")
    println("obj1.equals(obj3) : ${obj1.equals(obj3)}")
    println("obj1 ===obj3 : ${obj1 === obj3} ")
    println("obj1 !== ${obj1 !== obj3}")

    val nullTest: String? = "Kotlin"
    //nullTest - null
    // ?. : safe call 연산자 => null이 아니면 nullTest.length 반환, null이면면 null 반환
    println("nullTest?,length : ${nullTest?.length}")

    //? : Eivis 연산자 => null이 아니면 ?: 왼쪽 피연자 값을 반환, null이면 오른쪽 피연자 값을 반환
    val length = nullTest?.length ?: -1
    println("length : ${length}")

}

data class Score(val a: Int, val b: Int){}
