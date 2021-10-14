package com.example.mmpp1.classes

open class Machine(val itemCount:Int){
    fun increaseCount(itemCount: Int):Int{
        return itemCount+1
    }

    fun itemDone(item :Item):Boolean{
        item.done = true
        return item.done
    }
}