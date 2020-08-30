package com.example.android_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn1)
        btn.setOnClickListener { Toast.makeText(applicationContext, "нажали кнопку", Toast.LENGTH_LONG).show() }
        
    }
}