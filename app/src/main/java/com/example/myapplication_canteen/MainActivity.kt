package com.example.myapplication_canteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b=findViewById<Button>(R.id.lbutton)
        b.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
//        val intent = Intent(this, login::class.java)
//        startActivity(intent)
    }
}