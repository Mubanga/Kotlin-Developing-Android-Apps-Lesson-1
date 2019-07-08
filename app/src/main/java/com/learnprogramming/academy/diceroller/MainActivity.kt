package com.learnprogramming.academy.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private val _btnRoll by lazy { findViewById<Button>(R.id.btn_Roll) }
    private val _imgDiceRoll by lazy { findViewById<ImageView>(R.id.img_DiceRoll) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _btnRoll.text = "Let's Roll"
        _imgDiceRoll.setImageResource(R.drawable.dice_2)
        _btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {


        val drawableDiceImage = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        _imgDiceRoll.setImageResource(drawableDiceImage)

    }
}
