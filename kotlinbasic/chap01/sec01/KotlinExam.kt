package com.example.kotlinbasic.chap01.sec01
//코틀린 프로그램 구조

//main() 함수 : 프로그램 시작점
fun main() {
    println(makeMsg1(1))
    println(makeMsg1(2))
    println(makeMsg2(1))
    println("makeMsg3(1): ${makeMsg3(1)}")
    println("makeMsg4(2): ${makeMsg4(2)}")
}
//함수선언
fun makeMsg1(msgType: Int): String{
    return if (msgType == 1){
        "대한민국"
    } else{
        "코리아"
    }
}
//함수 선언(reutn문 생략 = "=="으로 대입
 fun makeMsg2(msgType: Int): String{
     return if (msgType == 1) "대한민국" else "코리아"
 }

//함수 선언(return 타입 생략) - 타입추론
fun makeMsg3(msgType: Int): String = if (msgType == 1) "안녕!" else "하이!"
fun makeMsg4(msgType: Int) = if(msgType == 1) "코틀린" else "kotlin"