package com.example.appsinapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val counterApp = findViewById<LinearLayout>(R.id.counterFrame)
        val clockApp = findViewById<LinearLayout>(R.id.clockView)

        counterApp.setOnClickListener {
            val intent = Intent(this, CounterApp::class.java)
            startActivity(intent)
        }

        clockApp.setOnClickListener {
            val intent = Intent(this, Clock::class.java)
            startActivity(intent)
        }
    }
}