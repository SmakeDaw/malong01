package com.example.malong01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0

        val rand: Button = findViewById(R.id.rand)
        val ms: Button = findViewById(R.id.ms)
        val count: Button = findViewById(R.id.count)
        val num: TextView = findViewById(R.id.num)

        ms.setOnClickListener {
            val toast = Toast.makeText(this, "This is Random number from intent", Toast.LENGTH_LONG) // in Activity
            toast.show()
        }

        count.setOnClickListener {
            number = num.text.toString().toInt()
            number += 1
            num.setText(number.toString())
        }

        rand.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("rand", number)
            startActivity(intent)
        }
    }
}