package com.example.colors

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 : Button = findViewById<Button>(R.id.button1)
        val btn2: Button = findViewById<Button>(R.id.button2)
        val btn3: Button = findViewById<Button>(R.id.button3)
        btn1.setOnClickListener() {
            val i = Intent(this,AnotherActivity::class.java)
            val colorCode: String = btn1.getTag().toString()
            println(colorCode)
            i.putExtra("color",colorCode)
            startActivity(i)
        }
        btn2.setOnClickListener() {
            val i = Intent(this,AnotherActivity::class.java)
            startActivity(i)
        }
        btn3.setOnClickListener() {
            val i = Intent(this,AnotherActivity::class.java)
            startActivity(i)
        }
    }
}
