package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage= findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button) //Reference to Button

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }

        //Roll the dice when the app starts
        rollDice()

    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val drawableResource=when(dice.roll()){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
      // var  diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

    }
}