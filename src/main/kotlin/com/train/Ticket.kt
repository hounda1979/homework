package com.train.hd

import java.util.*


class Ticket(){
    val discount = 0.9
    val ticketPrice = 1000
    var tickNum :Int =0
    var roundtrip : Int = 0



    fun calculation(){

        var tickCount = (tickNum-roundtrip)*ticketPrice
        var roundCount = (roundtrip*discount)*ticketPrice*2
        println("Total tickets:" + tickNum)
        println("Round-trip:"+roundtrip)
        println("Total: "+(tickCount+roundCount))
    }

    fun buyTickets() {
        var b = true
        do{
            var scanner = Scanner(System.`in`)
            println("Please enter number of tickets or enter -1 to end :")
            tickNum = scanner.nextInt()
            if(tickNum == -1){
                b = false
                break
            }
            println("How many round-trip tickets:")
            roundtrip = scanner.nextInt()
            if(roundtrip == -1){
                b = false
                break
            }
            if(roundtrip > tickNum){
                println("來回票大於票數")
                break
            }
            calculation()
        }while (b)
      print("離開購票系列 謝謝!!")
    }


}