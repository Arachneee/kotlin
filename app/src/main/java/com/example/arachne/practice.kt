package com.example.arachne

class Book private constructor(val id : Int, val name:String){

    companion object BookFactory : IdProvider{
        override fun getId(): Int {
            return 444
        }
        val mybook = "new book"
        fun create() = Book(getId(),mybook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.create()
    val bookid = Book.BookFactory.getId()
    println("${book.id} and ${book.name}")

    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(100)
    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}

//Singleton Pattern
object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horse:Int) : Car {
        val car = Car(horse)
        cars.add(car)
        return car
    }

}

data class Car(val horse : Int)