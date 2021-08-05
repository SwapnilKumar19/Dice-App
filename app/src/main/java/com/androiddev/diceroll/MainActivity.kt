package com.androiddev.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollbtn : Button
    lateinit var dicey : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollbtn = findViewById(R.id.rollbtn)
        rollbtn.setOnClickListener {
            rollDice()
        }

        dicey = findViewById(R.id.dicey)
    }

    private fun rollDice(){
        val randomInt = Random.nextInt(6)+1
        val diceface = when(randomInt){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice6
        }

        dicey.setImageResource(diceface)
    }
}