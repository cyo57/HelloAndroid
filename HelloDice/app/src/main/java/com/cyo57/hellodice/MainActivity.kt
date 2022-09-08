package com.cyo57.hellodice

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener { rollDice() }
        // 应用首次启动显示骰子图片
        rollDice()
    }


    fun rollDice() {
        //val textDice1: TextView = findViewById(R.id.textDice1)
        val imageDice: ImageView = findViewById(R.id.imageView)
        val myDice1 = Dice(6)
        val resultDice = myDice1.roll()
        //Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()

        val imageRes = when (resultDice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageDice.setImageResource(imageRes)
    }
}


class Dice(val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}