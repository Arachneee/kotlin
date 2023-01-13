package com.example.arachne

data class Ticket(val companyname : String, val name : String, var data : String, var seatname : Int)
class Ticketnm (val companyname : String, val name : String, var data : String, var seatname : Int)
//toString(), hashCode(), equals(), copy()

fun main(){
    val ticket = Ticket("ker", "coco", "2020-2030", 13)
    val ticketnm = Ticketnm("ker", "coco", "2020-2030", 13)
    println(ticket)
    println(ticketnm)
}