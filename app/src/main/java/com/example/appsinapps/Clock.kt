package com.example.appsinapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.TextView
import java.util.*

class Clock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)

        val timer = findViewById<TextView>(R.id.clocktime)
        val clockText = findViewById<TextClock>(R.id.simpleTextClock)

        timer.text = clockText.text

    }
}