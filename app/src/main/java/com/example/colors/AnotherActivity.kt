package com.example.colors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        val color = intent.extras.getString("color")
        println(color)
        println(Integer.parseInt(color.replaceFirst("^#",""), 16))
        window.decorView.setBackgroundColor(Integer.parseInt(color.replaceFirst("^#",""), 16))
    }
}
