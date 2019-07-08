package com.learnprogramming.academy.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private val _btnRoll by lazy { findViewById<Button>(R.id.btn_Roll) }
    private val _txtResult by lazy { findViewById<TextView>(R.id.txtView_DiceRoll)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _btnRoll.text = "Let's Roll"
        _btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {


        val randomNumber = Random().nextInt(6) + 1
        _txtResult.text = randomNumber.toString()

    }
}
