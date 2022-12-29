package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startClassic : Button
    lateinit var startJobIntent : Button
    lateinit var stopClassic : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startClassic = findViewById(R.id.startClassicService)
        startJobIntent = findViewById(R.id.startJobIntent)
        stopClassic = findViewById(R.id.stopService)

        startClassic.setOnClickListener {

            val intent = Intent(this@MainActivity, ClassicServiceEx::class.java)
            startService(intent)

        }

        startJobIntent.setOnClickListener {

            val intent = Intent (this@MainActivity, JobIntentEx::class.java)
            JobIntentEx.myBackgroundService(this@MainActivity, intent)

        }

        stopClassic.setOnClickListener {
            val intent = Intent(this@MainActivity, ClassicServiceEx::class.java)
            stopService(intent)

        }
    }


}