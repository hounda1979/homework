package com.train.hd

import java.util.*


class Ticket(){
    val discount = 0.9
    val ticketPrice = 1000
    var ticknum :Int =0
    var roundticket : Int = 0
    var array = IntArray(2)


    fun calculation(){

        var tickCount = (array[0]- array[1])*ticketPrice
        var roundCount = (array[1]*discount)*ticketPrice*2
        println("Total tickets:" + array[0])
        println("Round-trip:"+array[1])
        println("Total: "+(tickCount+roundCount))
    }

    fun buyTickets() {
        var b = true
        do{
            var scanner = Scanner(System.`in`)
            println("Please enter number of tickets or enter -1 to end :")
            ticknum = scanner.nextInt()
            if(ticknum == -1){
                b = false
                break
            }else{
                array[0] += ticknum
            }
            println("How many round-trip tickets:")
            roundticket = scanner.nextInt()
            if(roundticket == -1){
                b = false
                break
            }else{
                array[1] += roundticket
            }
            if(roundticket > ticknum){
                println("來回票大於票數")
                break
            }


        }while (b)
        calculation()
    }


}