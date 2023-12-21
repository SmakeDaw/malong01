package com.example.malong01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val number2: TextView = findViewById(R.id.number2)
        val setzero: Button = findViewById(R.id.setzero)
        val numrand: TextView = findViewById(R.id.numrand)
        var numr: Int = 0


        val receivedIntent = intent
        val rand = receivedIntent.getIntExtra("rand", 0)

        number2.setText("Here is a random number \n between 0 and $rand")
        numr = Random.nextInt(0, rand)
        numrand.setText(numr.toString())

        setzero.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}