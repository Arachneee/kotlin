package com.example.arachne

fun main(){
    helloWord()

    println(add(4,5))

    //3. String Template
    val name = "haha"
    val jj = "Kim"
    println("my name is ${name + jj} and me") // f""랑 비슷
    println("this is \$a")    // $기호 출력

    checkNum(score = 85)
    arrayf()
    forandwhile()
    nullcheck()
    ignoreNulls("jojo")
}

/*주석 달기
*
*
* */

//1. function
fun helloWord() {
    println("Helow World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
// val = 상수
// var = 변수

fun hi(){
    val a: Int = 10
    var b = 9 // : Int 생략 가능
    var name = "arachne"
    var e : String
    b = 100
}

fun maxBy(a : Int, b: Int): Int{
    if(a>b) {
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b

fun checkNum(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2,3")
    }

    var b: Int = when(score){
        1->1
        2->2
        else ->3              //선얼할 때는 else 써야됨
    }
    println("b : ${b}")
    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement kotlin 에서 모든 함수는 Expression

// 5. Array and list
// Array
// List 1. List 2. Mutablelist

fun arrayf(){
    val array1 = arrayOf(1,2,3)
    val list1 = listOf(1,2,3)
    val array2 = arrayOf(1,"b", 3.4f)
    val list2 = listOf(1,"b",11L)


    println("array1 : ${array1}")
    println("array1 : ${array1.get(0)}")
    array1[0] = 3
    println("array1 : ${array1.get(0)}")

    // list1[0] = 1  불변
    var result1 = list1.get(0)  //가져오는 것만 됨
    var result2 = list1[0]
    println("result : $result1")
    println("result : $result2")

    val arrayList = arrayListOf<Int>(1,2,3)
    arrayList.add(10)
    arrayList[0] = 20
    println("arrayList : ${arrayList.get(0)}")
    println("arrayList : ${arrayList[3]}")
    println("result : $result1")
    println("result : $result2")
}

//6. for / while

fun forandwhile(){
    val students = arrayListOf<String>("aa", "ba", "ca", "da")

    for (name:String in students){
        println("My name is ${name}")
    }
    var sum = 0
    for (i : Int in 1..10 step 2){
        sum += i
    }
    println("SUM : ${sum}")
    for (i : Int in 10 downTo 1){
        sum += i
    }
    for (i : Int in 1 until 100){
        sum += i
    }
    var index = 0

    while(index <10){
        index ++
        print("hi $index") // 행 바꿈 생략
    }

    for ((index : Int, name:String) in students.withIndex()){
        println("${index+1}번째 학생은 ${name}")
    }
}

//7. Nullable / NonNull
fun nullcheck(){
    var name2 : String = "arachen"
    var nullname : String? = null  //? 붙이면 null이 가능해짐

    var nameupp = name2.uppercase()
    var nullnameupp = nullname?.uppercase()
    println("nameupp $nameupp")
    println("nullnameupp $nullnameupp")

    // ?:

    val lastname : String? = null

    val fullname = name2 + (lastname?: " No lastName")

    println(fullname)

}

fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()

    val email : String? = null
    email?.let{
        println("my email is $email")           //null 이 아니면 실행
    }
}

