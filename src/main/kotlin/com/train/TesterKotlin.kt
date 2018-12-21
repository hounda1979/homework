package com.train

import java.util.*


fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var ticknum = scanner.nextInt()
    println("How many round-trip tickets:")
    var roundnum = scanner.nextInt()
    val ticket = Ticketprice(ticknum,roundnum)
    if((ticknum - roundnum) <= 0){
        println("來回票大於票數")
    }else {
        ticket.Calculation()
    }

}

class Ticketprice(var tickNum : Int , var roundtrip : Int){
    val discount = 0.9
    val ticketPrice = 1000

     fun Calculation(){
        var tickCount = (tickNum-roundtrip)*ticketPrice
         var roundCount = (roundtrip*discount)*ticketPrice*2
         println("Total tickets:" + tickNum)
         println("Round-trip:"+roundtrip)
         println("Total: "+(tickCount+roundCount))

    }

}