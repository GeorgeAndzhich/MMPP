package com.example.mmpp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val detailNumField = findViewById<EditText>(R.id.editTextNumber)
        val detailNumber = detailNumField.toString().toInt()
        val startButton = findViewById<Button>(R.id.button)
        startButton.setOnClickListener{
            if (detailNumber > 0){
                Intent(this,Animation::class.java).also {
                    it.putExtra("EXTRA_NUMBER",detailNumber)
                    startActivity(it)
                }
            } else{
                Toast.makeText(this,"Введите положительное число!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}