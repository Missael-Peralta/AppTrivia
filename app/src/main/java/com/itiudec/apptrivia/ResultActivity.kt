package com.itiudec.apptrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val playButton = findViewById<Button>(R.id.playAgainButton)

        val bundle = intent.extras
        val fact = bundle?.getInt("score")

        val result = findViewById<TextView>(R.id.userScore)
        result.text = "You got " + fact.toString() + " hits out of 3"

        playButton.setOnClickListener(){
            val send = Intent (this, MainActivity::class.java)
            startActivity(send)
        }

    }
}