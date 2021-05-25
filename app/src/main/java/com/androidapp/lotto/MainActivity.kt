package com.androidapp.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView_random = findViewById<CardView>(R.id.cardView_random)
        val cardView_constellation = findViewById<CardView>(R.id.cardView_constellation)
        val cardView_name = findViewById<CardView>(R.id.cardView_name)

        cardView_random.setOnClickListener{
            startActivity(Intent(this@MainActivity, ResultActivity::class.java))
        }

        cardView_constellation.setOnClickListener{
                startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
        cardView_name.setOnClickListener{
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}