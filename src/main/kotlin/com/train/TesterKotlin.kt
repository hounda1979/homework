package com.train

fun main(args: Array<String>) {

}

class Ticketprice(var tickNum : Int , var roundtrip : Int){
    val discount = 0.9
    val ticketPrice = 1000
    init {
        Check()
    }
     fun Calculation(){
        var tickCount = (tickNum-roundtrip)*ticketPrice
         var roundCount = (roundtrip*discount)*ticketPrice*2
         println("Total tickets:" + tickNum)
         println("Round-trip:"+roundtrip)
         println("Total: "+(tickCount+roundCount))

    }


    private fun Check() : Boolean{
        var b = true
        if((roundtrip - tickNum) < 0){
            print("錯誤!! 來回票大於購買票數")
            b = false
        }
        return b
    }
}