package com.itiudec.apptrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameText)
        val goButton = findViewById<Button>(R.id. goButton)

        goButton.setOnClickListener(){
            if (nameInput.text.isEmpty()){
                Toast.makeText(this, "please type something...", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent (this, Question1Activity::class.java)
            startActivity(intent)
        }


    }
}