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
        var detailNumber = intent.getIntExtra("EXTRA_NUMBER", 1)
        val text = findViewById<TextView>(R.id.textView3)
        text.text = detailNumber.toString()
        var count = text.text.toString().toInt()
        var stanok1Text = findViewById<TextView>(R.id.textView6)
        var stanok2Text = findViewById<TextView>(R.id.textView8)
        var finalItemsText = findViewById<TextView>(R.id.textView10)


        /*Инициализация начальных данных и структур*/
        var doneItems = ArrayList<Item>()
        var finalItems = ArrayList<Item>()
        var itemList = ArrayList<Item>(detailNumber)
        for (item in itemList.listIterator()) {
            itemList.add(item)
        }
        var machine1 = Machine()
        var machine2 = Machine2()

        var B:Int = 0
        var P:Int = 0

        /*Главный цыкл*/
        for (item in itemList.indices){
            text.text = detailNumber.toString()
            stanok1Text.text = machine1.itemCount.toString()
            stanok2Text.text = machine2.itemCount.toString()
            finalItemsText.text = finalItems.size.toString()
                machine1.increaseCount(machine1.itemCount)
                machine2.startMachine(itemList)
                machine1.itemDone(itemList[item])
                machine2.itemDone(itemList[item + 1]) /*Ошибка - одну деталь одновременно обрабатывают два станка*/ /*Ошибка обработана!!!*/
                if (itemList[item].done1 == true and itemList[item].done2 == false) {
                    doneItems.add(itemList[item])
                    doneItems.remove(itemList[item])
                } else if (itemList[item].done1 == true and itemList[item].done2 == true) {
                    doneItems.add(itemList[item])
                    finalItems.add(itemList[item])
                    doneItems.remove(itemList[item])
                    itemList.remove(itemList[item])
                    detailNumber = itemList.size
                }

            if (detailNumber == 0) {
                P = detailNumber
                B = 0
                Intent(this,Final::class.java).also {
                    it.putExtra("EXTRA_P",P)
                    it.putExtra("EXTRA_B",B)
                    startActivity(it)
                }

            }
        }

    }
   }

