package com.example.hw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameET = findViewById<EditText>(R.id.nameET)
        val surnameET = findViewById<EditText>(R.id.surnameET)
        val phoneET = findViewById<EditText>(R.id.phoneET)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            val firstName = nameET.text.toString()
            val surname = surnameET.text.toString()
            val phone = phoneET.text.toString()

            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("First Name", firstName)
            intent.putExtra("Surname", surname)
            intent.putExtra("Phone", phone)
            startActivity(intent)
        }
    }
}