package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage= findViewById(R.id.dice_image)

        val RollButton: Button = findViewById(R.id.roll_button) //Reference to Button
        RollButton.text="Roll Button"
        RollButton.setOnClickListener(){

            rollDice()
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }

    }

    fun rollDice(){
        val randomInt= Random.nextInt(6)+1

        val drawableResource=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
      // var  diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)

    }
}