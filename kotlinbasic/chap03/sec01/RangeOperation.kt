package com.example.kotlinbasic.chap03.sec01

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val lowerAlphaRange = 'a'.. 'z'
    val numberRange = 1 .. 100
    println("isLower: ${'d' in lowerAlphaRange}")
    println("isNumber: ${101 in numberRange}")
    println()

    for (i in 1 .. 10) print("$i, ")
    println()
    for(i in 'a' .. 'z') print("$i, ")
    println()

    //날짜 범위 사용
    val start = LocalDate.now()
    println("start : $start")
    //plusDays(15) : 인자로 전달된 값을 현재 일자로부터 더한 날짜를 범위로 반환
    val end = start..start.plusDays(5)
    println("end: $end")

    /*plusWeeks(1) : 인자로 전달된 값(주)을 현재 요일에 더한 날짜를 반환
    -ex)start.plusweek(1) :현재 요일 + 1주의 날짜 반환
     */

    println("add weeks : ${start.plusWeeks(1)}")
    println("add weeks: ${start..start.plusWeeks(1)}")
}