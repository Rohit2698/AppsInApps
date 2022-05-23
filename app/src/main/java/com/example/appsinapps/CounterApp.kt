package com.example.appsinapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CounterApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter_app)

        var counter = 0
        val incrementButton = findViewById<Button>(R.id.increment)
        val decrementButton = findViewById<Button>(R.id.decrement)
        val counterValue = findViewById<TextView>(R.id.counterValue)

        incrementButton.setOnClickListener {
            counter+=1
            counterValue.text = counter.toString()
        }


        decrementButton.setOnClickListener {
            if(counter === 0){
                return@setOnClickListener
            }
            counter-=1
            counterValue.text = counter.toString()
        }
    }
}