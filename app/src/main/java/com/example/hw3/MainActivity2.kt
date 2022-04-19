package com.example.hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var intent = intent
        val firstName = intent.getStringExtra("First Name")
        val surname = intent.getStringExtra("Surname")
        val phone = intent.getStringExtra("Phone")

        val resultTv = findViewById<TextView>(R.id.resultTv)

        resultTv.text = "First Name: $firstName\nSurname: $surname\nPhone: $phone"

    }
}