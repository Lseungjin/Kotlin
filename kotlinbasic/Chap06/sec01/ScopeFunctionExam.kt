package com.example.kotlinbasic.Chap06.sec01

class NoteBook(var model: String, var year: Int, var price: Int){
    fun getDiscount(){
        price -= 25
    }
}

data class Student(
    var id: String = "",
    var name: String = "",
    var gpa : Float = 0.0f
){
    fun isGPA(): Boolean = gpa < 1.5f
}

fun main() {
    var notebook = NoteBook("LG그램", 2023, 250)
    println("model: ${notebook.model}, year: ${notebook.year}, price: ${notebook.price}")
    var myNoteBook = NoteBook("LG그램", 2023, 230).apply{
    model = "[New!] $model"
    getDiscount()
    println("model: $model, year: $year, price: $price")
    }
    println("model: ${myNoteBook.model}, year: ${myNoteBook.year}, price: ${myNoteBook.price}")

    val iu = Student()
    iu.id = "C2022001"
    iu.name = "아이유"
    iu.gpa = 4.5f
    println("ID: ${iu.id}, NAME: ${iu.name}, GPA: ${iu.gpa}")

    val john = Student().apply{
        id = "C2022002"
        name = "John"
        gpa = 1.4f
        println("ID: $id, NAME: $name. GPA: $gpa")
    }
    val noteModel = myNoteBook.run{
        println("model: $model, year: $year, price: $price")
        "model: $model($year"
    }
    println(noteModel)

    val isAcademicProbation = john?.run{
        isGPA()
    }
    println("학사경고: $isAcademicProbation")

    val isAcademicWaring = run{
        iu.isGPA()
    }
    println("학사경고: $isAcademicWaring")

    with(myNoteBook){
        println("model: $model, year: $year, price: $price")
    }

    val infoNoteBook = myNoteBook.let{
        "MyNoteBook => model: ${it.model}, year ${it.year}, price ${it.price}"
    }
    println(infoNoteBook)
    //====================================================
    var myNoteBook2 = NoteBook("LG그램 360", 2023, 300).also{
        it.model = "[NEW! 2023] ${it.model}"
        it.getDiscount()
    }
    println("MyNoteBook2 => model: ${myNoteBook2.model}, price: ${myNoteBook2.price}")
}