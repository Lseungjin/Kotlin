package com.example.kotlinbasic.chap09.sec03

data class Customer( val name: String, val age: Int, val tel: String){
    init{
        println("멤버 속성이 초기화 되었습니다.")
    }
    var nationality: String = "KOREA"
    constructor(name: String, age: Int, tel: String, _nationality: String) : this(name, age, tel,){
        nationality = _nationality
    }
}
class CustomerManager {
    // Customer 클래스 타입의 고객 리스트
    private val customList = ArrayList<Customer>()

    // 회원가입
    fun joinCustomer(customer: Customer){
        when { // == if-else-if
            customer.age < 20 -> {
                println("나이가 20세 미만입니다. : ${customer.name} - ${customer.age}")
                return
            }
            else -> {
                println("나이가 20세 이상입니다. : ${customer.name} - ${customer.age}")
            }
        }
        this.customList.add(customer)

    }

    //회원 리스트 출력
    fun printAllCustomer(){
        println("=".repeat(50))
        println("      === 등록 고객 리스트 (총 ${customList.size}명) ===     ")
        println("=".repeat(50))

        this.customList.forEach{
            println(it)
        }
    }
}
/*코틀린프로그래밍-2 p65*/
fun main() {
    val obj1 = Customer("손흥민", 28, "010-123-4567")
    val obj2= Customer("이강인", 19, "010-456-7891")
    val obj3 = Customer("봉준호", 52, "010-789-1234", "KOREA")

    println("obj1: $obj1")
    println("obj2: $obj2")
    println("obj3: $obj3")

    println("${obj3.name} 감독의 국적은 ${obj3.nationality}입니다.")
    println(obj1 == obj2)
    println(obj1.hashCode() == obj2.hashCode())
    println("obj1.hashCode() : ${obj1.hashCode()} == obj2.hashCode() : ${obj2.hashCode()}")

    val obj4 = obj1.copy(tel="010-777-7777")
    println(obj4)
    println(obj4 == obj1)
    println(obj4 === obj1)

    val (fName, fAge, fTel) = obj1
    println("$fName, $fAge, $fTel")

    val customerList = listOf(obj1, obj2, obj3, obj4)
    for ( (name, age, tel) in customerList){
        println("name: $name, age: $age, tel: $tel")
    }
    println("===========================")

    val lambdaCustom = {
        (name, age, tel) : Customer ->
        println("name: $name, age: $age, tel: $tel")
    }

    for (obj in customerList){
        lambdaCustom(obj)
    }

    println("============================")

    val obj5 = Customer("김민재", 27, "010-321-1234")
    val obj6 = Customer("김혜인", 17, "010-654-4567")
    val obj7 = Customer("최민아", 21, "010-987-7890")

    //고객 등록
    val manager = CustomerManager()
    manager.joinCustomer(obj1)
    manager.joinCustomer(obj2)
    manager.joinCustomer(obj3)
    manager.joinCustomer(obj4)
    manager.joinCustomer(obj5)
    manager.joinCustomer(obj6)
    manager.joinCustomer(obj7)

    //등록 고객 리스트 출력
    manager.printAllCustomer()
}