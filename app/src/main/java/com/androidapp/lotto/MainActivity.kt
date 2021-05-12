package com.androidapp.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView_constellation = findViewById<CardView>(R.id.cardView_constellation)

        cardView_constellation.setOnClickListener{
                startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
    }
}