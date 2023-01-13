package com.example.arachne

// 1.lamda 익명 함수
// val lamdaName : Type = {argumentList -> codeBody}

val squere : (Int) -> (Int) = {number -> number*number}
// val squere  = {number : Int -> number*number : Int}

val nameAge : (String, Int) -> String = {name: String, age:Int ->
    "my name is ${name} and my age is ${age}"
}

fun main(){
    println(squere(10))
    println(nameAge("nana", 10))
    val b = "coco said"
    println(b.pizza())
    println(extendString("nana", 27))
    println(calculateGrade(41))

    val lamda1 = {number: Double ->
        number == 4.566
    }

    println(invokeLamda(lamda1))
    println(invokeLamda({it >5}))
    println(invokeLamda { it > 5 })  // 마지막 파라미터가 lamda 식일 때 이런식으로 표현

}

// 확장 함수

val pizza : String.() -> String = {
    this + "Pizza is great"
}

fun extendString(name: String, age: Int) : String{
    val introducess : String.(Int) -> String ={"I am ${this} and ${it} years old"}   // it : input only one parameter
    return name.introducess(age)
}

// lamda return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..10 -> "fail"
        in 41..100 -> "tt"
        else -> "Error"
    }
}

// lamda 다른 표현식
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.234)
}

