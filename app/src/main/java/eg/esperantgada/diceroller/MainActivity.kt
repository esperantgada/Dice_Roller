package eg.esperantgada.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.R

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button) //Reference to Button

        rollButton.setOnClickListener {
            rollDice()
        }

        //Roll the dice when the app starts
        rollDice()

    }

    private fun rollDice(){

        //Create an instance of Dice class and pass in 6
        val dice = Dice(6)

        //Call roll method on this instance or object
        val diceRoll = dice.roll()

        //Select an image based on the roll result
        val drawableResource = when(dice.roll()){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        //Set the ImageView with the appropriate image based on the roll result
        diceImage.setImageResource(drawableResource)

        // Set the content description based on the roll value
        diceImage.contentDescription = diceRoll.toString()


        //Show the value of roll result
        Toast.makeText(this, "Roll result: ${diceRoll}", Toast.LENGTH_SHORT).show()

    }
}