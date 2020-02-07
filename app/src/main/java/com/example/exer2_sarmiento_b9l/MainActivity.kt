package com.example.exer2_sarmiento_b9l

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var charImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun startUp(view: View) {
        val randomInt = (1..10).random()
        charImage = findViewById(R.id.char_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.link
            2 -> R.drawable.deku
            3 -> R.drawable.zekda
            4 -> R.drawable.ganon
            5 -> R.drawable.skull
            6 -> R.drawable.tetra
            7 -> R.drawable.tingle
            8 -> R.drawable.vaati
            9 -> R.drawable.king
            else -> R.drawable.malon

        }

        charImage.setImageResource(drawableResource)
    }
    fun reStart(view: View) {

    }
}
