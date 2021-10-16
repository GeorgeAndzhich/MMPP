package com.example.mmpp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        val detailNumber = intent.getIntExtra("EXTRA_NUMBER",1)
        val text = findViewById<TextView>(R.id.textView3)
        text.text = detailNumber.toString()
    }
}

