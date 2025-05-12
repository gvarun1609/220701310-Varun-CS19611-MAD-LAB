package com.example.odlettergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateEditText = findViewById<EditText>(R.id.dateEditText)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val reasonEditText = findViewById<EditText>(R.id.reasonEditText)
        val generateButton = findViewById<Button>(R.id.generateButton)
        val letterTextView = findViewById<TextView>(R.id.letterTextView)
        val rollnoEditText=findViewById<TextView>(R.id.letterTextView)

        generateButton.setOnClickListener {
            val date = dateEditText.text.toString().trim()
            val name = nameEditText.text.toString().trim()
            val rollno = rollnoEditText.text.toString().trim()
            val reason = reasonEditText.text.toString().trim()
            if (date.isNotEmpty() && name.isNotEmpty() && reason.isNotEmpty()) {
                val letter = "This is to certify that $name $rollno is permitted to go on OD on $date for the reason: $reason."
                letterTextView.text = letter
            } else {
                letterTextView.text = "Please fill in all fields."
            }
        }
    }
}
