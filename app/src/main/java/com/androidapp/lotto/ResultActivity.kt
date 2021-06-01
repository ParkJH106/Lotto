package com.androidapp.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 1) get result
        val result = intent.getIntArrayExtra("result") ?: return
        val strConstellation = intent.getStringExtra("constellation")
        // 2) sort the array
        //println("result is $result")
        //result.sort()
        //println("result sorted is $result")

        val result_sorted = result?.sorted()
        //val result_sorted = result?.sortedBy { it }
        //val result_sorted = result?.sorted()
        //println("result_sorted is" + result_sorted)

        result?.let {
            updateLottoBallImage(result.sortedBy { it })
        }

        // 3) update text and image
        strConstellation?.let {
            val resultLabel = findViewById<Button>(R.id.resultLabel)
            resultLabel.text = "${strConstellation}의 ${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())} 로또입니다."
        }
        result?.let{
            updateLottoBallImage(result.sortedBy{it})
        }
        // 3) set images
/*        val lottoBallImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoBallImageStartId + result_sorted!![0] - 1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)

*/
    }

    private fun updateLottoBallImage(result_sorted: List<Int>) {
        val lottoBallImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoBallImageStartId + result_sorted[0]!! - 1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)
    }

}