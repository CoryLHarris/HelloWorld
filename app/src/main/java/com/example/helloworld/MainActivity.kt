package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener{
            Log.v("hello world!","button clicked")
        Toast.makeText(this,"hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}