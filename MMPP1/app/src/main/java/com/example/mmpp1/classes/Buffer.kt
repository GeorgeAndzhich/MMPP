package com.example.mmpp1.classes

class Buffer(var count:Int) {
    fun increaseCount():Int{
        return count +1
    }
    fun passItem(machine: Machine){
        machine.increaseCount(machine.itemCount)
    }
}