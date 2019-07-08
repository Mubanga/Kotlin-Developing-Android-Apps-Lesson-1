package com.learnprogramming.academy.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val _btnRoll by lazy { findViewById<Button>(R.id.btn_Roll) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _btnRoll.text = "Let's Roll"
        _btnRoll.setOnClickListener {
            Toast.makeText(this,"Button Has Been Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}
