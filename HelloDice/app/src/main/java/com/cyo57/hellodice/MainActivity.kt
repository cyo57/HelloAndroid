package com.cyo57.hellodice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener { rollDice() }


    }
    fun rollDice() {
        val textDice1: TextView = findViewById(R.id.textDice1)
        val textDice2: TextView = findViewById(R.id.textDice2)
        val myDice1 = Dice(6)
        val myDice2 = Dice(6)
        textDice1.text = myDice1.roll().toString()
        textDice2.text = myDice2.roll().toString()
        Toast.makeText(this, "Roll completed", Toast.LENGTH_SHORT).show()
    }
}



class Dice(val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }

}