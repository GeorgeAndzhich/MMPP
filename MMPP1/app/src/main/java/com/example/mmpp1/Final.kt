package com.example.mmpp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val finalButton = findViewById<Button>(R.id.button2)


        finalButton.setOnClickListener{
            Toast.makeText(this,"Возвращаемся в начало",Toast.LENGTH_SHORT).show()
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }
    }
}