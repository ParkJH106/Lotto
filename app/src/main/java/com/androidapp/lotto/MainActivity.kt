package com.androidapp.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*

fun getRandomLottoNumber() : Int {
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers(): MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()

    while(true) {
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0

            if(lottoNumbers.contains(number)) {
//                flag_existing = 1
//                continue
            }

//        if (flag_existing.equals(1))
//            continue
//        else
            lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
            break;
    }
    return lottoNumbers
}
fun getShuffledLottoNumbers () : MutableList<Int> {
    val list = mutableListOf<Int>()

    for(number in 1..45) {
        list.add(number)
    }
    list.shuffle()

    return list.subList(0, 6)
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView_random = findViewById<CardView>(R.id.cardView_random)
        val cardView_constellation = findViewById<CardView>(R.id.cardView_constellation)
        val cardView_name = findViewById<CardView>(R.id.cardView_name)

        cardView_random.setOnClickListener{
            val intent = Intent (this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumber()))
            startActivity(intent)
        }
        cardView_constellation.setOnClickListener{
                startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
        cardView_name.setOnClickListener{
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}