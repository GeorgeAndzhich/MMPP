package com.example.mmpp1.classes

open class Machine(){
    fun increaseCount(itemCount: Int):Int{
        return itemCount+1
    }
    open val brak = 0.02
    var itemCount = 0
    open val t = 60
    fun itemDone(item :Item):Boolean{
        if (item.done1 == false){
            item.done1 = true
            return item.done1
        }else{
            item.done2 = true
            return item.done2
        }
    }
}