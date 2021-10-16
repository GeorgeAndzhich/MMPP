package com.example.mmpp1.classes

class Machine2() : Machine() {
    fun startMachine(items:List<Item>){
        if (items.size == 3){
            increaseCount(itemCount)
        }
    }
    override val t = 40
}