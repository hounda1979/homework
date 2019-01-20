package com.box

import hd.com.box.Box
import hd.com.box.Box3
import hd.com.box.Box5
import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {

    input()




}
fun input(){

        var s = Scanner(System.`in`)
        val arrays = listOf<String>("length", "width", "height")
        var typeInSize = mutableListOf<Float>()
        var aFloat: Float
        for (array in arrays) {
            println(" Please enter object's $array :")
            try {
                aFloat = s.nextFloat()
            } catch (e: Exception) {
                println("請輸入0-9數字 謝謝 ")

                break
            }

                typeInSize.add(aFloat)

        }
        if (Box3().validate(typeInSize)) {
            println(Box3().getBoxType())
        } else if (Box5().validate(typeInSize)) {
            println(Box5().getBoxType())
        } else {
            println("sorry 輸入尺寸和Box3 & Box5 不符合")
        }




}