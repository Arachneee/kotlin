package com.example.arachne

open class Human constructor(val name: String = "None"){      // open 해야 상속 가능

    constructor(name:String, age:Int) : this(name){
        println("my name : $name and Age : $age")
    }

    init{
        println("New Human has been born")
    }

    open fun eatingCake(){      // open 해야 상속에서 override 가능
        println("This is cake")
    }
}

class Korean : Human(){    // 상속
    override fun eatingCake() {         // 수정
        super.eatingCake()            // 부모꺼도 출력
        println("얌얌")
    }
}

fun main(){

    val human = Human("coco")
    human.eatingCake()

    println("human's name is ${human.name}")

    val stranger = Human()
    println("human's name is ${stranger.name}")
    stranger.eatingCake()

    val human1= Human("kiki", 10)

    val kr = Korean()
    kr.eatingCake()

}