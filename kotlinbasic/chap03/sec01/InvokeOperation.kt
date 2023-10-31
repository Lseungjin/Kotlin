package com.example.kotlinbasic.chap03.sec01



//invoke 연산자
//person 클래스 선언
class Person(val name: String){
    /**invoke()함수 선언(overloading)*/
    operator fun invoke(phone: String, email: String){
        println(" name: $name, phone: $phone, email: $email")
    }
}

fun main() {
    /** Person클래스의 인스턴스(객체) 생성 */
    val sony = Person("손흥민")
    println("name: ${sony.name}")//참조 변수를 통한 name 멤버 변수 access

    /** invoke() 함수 호출 */
    sony.invoke("010-1234-1234", "sony@gmail.com")

    /**invoke() 함수 호출(이름 없이 간편 호출(인스턴스(참조변수에)에 괄호())*/
    sony("010-1234-1234", "sony@gamil.com")

    /**람다식에서 invoke() 함수 호출
     * -람다식은 컴파일 하면서 invoke()함수 정의하기 떄문에
     * reult.invoke() 또는 result()로 간편 호출 가능(invoke생략)
     */
    val intData = 100
    val result: () -> Int = {intData + 100}

    println("result: ${result.invoke()}")
    println("result: ${result()}")
}


