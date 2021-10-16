package com.example.mmpp1
import com.example.mmpp1.classes.Machine
import com.example.mmpp1.classes.Machine2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mmpp1.classes.Item
import java.io.FileWriter

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        val detailNumber = intent.getIntExtra("EXTRA_NUMBER",1)
        val text = findViewById<TextView>(R.id.textView3)
        text.text = detailNumber.toString()
        var count =   text.text.toString().toInt()


        /*Инициализация начальных данных и структур*/
        var doneItems = ArrayList<Item>()
        var finalItems = ArrayList<Item>()
        var itemList = ArrayList<Item>()
        for (count in itemList.listIterator()){
            var item = Item(false,false)
            itemList.add(item)
        }
        var machine1 = Machine()
        var machine2 = Machine2()

        while (count!=0){
            itemList.forEach {
                var index = 0
                machine1.increaseCount(machine1.itemCount)
                machine2.startMachine(itemList)
                machine1.itemDone(itemList[index])
                machine2.itemDone(itemList[index+1])
                if (itemList[index].done1 == true and itemList[index].done2 == false ){
                        itemList.remove(itemList[index])
                        doneItems.add(itemList[index])
                        doneItems.remove(itemList[index])
                        itemList.add(itemList[index])
                    } else if (itemList[index].done1 == true and itemList[index].done2 == true){
                            doneItems.add(itemList[index])
                            finalItems.add(itemList[index])
                            doneItems.remove(itemList[index])
                        }
                }
            }
        }
    }


