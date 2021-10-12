package com.example.mmpp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        val detailNumber = intent.getIntExtra("EXTRA_NUMBER",1)
    }
}

