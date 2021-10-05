package com.itiudec.apptrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Question3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        val responseButton1 = findViewById<Button>(R.id. Button1)
        val responseButton2 = findViewById<Button>(R.id. Button2)
        val responseButton3 = findViewById<Button>(R.id. Button3)

        responseButton1.setOnClickListener(){
            val send = Intent (this, ResultActivity::class.java)
            val bundle = intent.extras
            val fact = bundle?.getInt("score")
            var hit = fact?.plus(1)
            send.putExtra("score", hit)
            startActivity(send)
        }

        responseButton2.setOnClickListener(){
            val send = Intent (this, ResultActivity::class.java)
            val bundle = intent.extras
            val fact = bundle?.getInt("score")
            var hit = fact?.plus(0)
            send.putExtra("score", hit)
            startActivity(send)
        }

        responseButton3.setOnClickListener(){
            val send = Intent (this, ResultActivity::class.java)
            val bundle = intent.extras
            val fact = bundle?.getInt("score")
            var hit = fact?.plus(0)
            send.putExtra("score", hit)
            startActivity(send)
        }

        }
    }
