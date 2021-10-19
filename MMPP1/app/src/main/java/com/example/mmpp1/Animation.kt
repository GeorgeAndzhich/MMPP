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

        /*Главный цыкл*/
            for (item in itemList.indices)
            itemList.forEach {
                machine1.increaseCount(machine1.itemCount)
                machine2.startMachine(itemList)
                machine1.itemDone(itemList[item])
                machine2.itemDone(itemList[item+1]) /*Ошибка - одну деталь одновременно обрабатывают два станка*/ /*Ошибка обработана!!!*/
                if (itemList[item].done1 == true and itemList[item].done2 == false ){
                        doneItems.add(itemList[item])
                        doneItems.remove(itemList[item])
                    } else if (itemList[item].done1 == true and itemList[item].done2 == true){
                            doneItems.add(itemList[item])
                            finalItems.add(itemList[item])
                            doneItems.remove(itemList[item])
                            itemList.remove(itemList[item])
                    }
                }
                if (itemList.size == 0){
                    TODO("Логика расчета показателей")
                    /*Здесь понадобятся т, время которе прошло.
                    * Формулы для расчета:
                    * Производительность [П]
                    *   П = сделанные / время которое прошло
                    * Уровень брака [Б]:
                    * Б = (совокупная бракованность деталей / сумма брака станков )*100*/
                }
       }
   }

