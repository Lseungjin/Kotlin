package com.example.kotlinbasic.chap07.sec03

fun main() {
    val account = Account()
    println(account.balance)
    println("==============")
    println("acccount.balance: ${account.balance}")

}

class Account(){
    init{
        println("init block")
    }

    val balance: Int by lazy{
        println("Setting balance: ")
        10000
    }
}