package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Finds the button in the layout editor, links it to your code and assigns it to a variable
    val rollButton: Button = findViewById (R.id.button)
        // the click listener executes the code in the rolldice function whenever it is clicked
        rollButton.setOnClickListener { rollDice() }
        // Roll the dice when the app starts
        rollDice()
    }

    private fun rollDice() {
        // makes a dice object with 6 sides and calls the roll method.
        // Note: you cannot call the roll method without making a dice object
        // First dice object
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Second dice object
        val dice2 = Dice(6)
        val dice2Roll = dice2.roll()
        // Finds the imageview in the layout editor, links it to your code and assigns it to a variable
        val diceImage: ImageView = findViewById(R.id.imageView)
        val secondDiceImage: ImageView = findViewById(R.id.imageView2)
         // when statement is a (much more convenient) kotlin replacement for if/else statements
        when (diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6) }
        //Provides an additional text corresponding with the image for screen readers
            diceImage.contentDescription = diceRoll.toString()

        when (dice2Roll){
            1 -> secondDiceImage.setImageResource(R.drawable.dice_1)
            2 -> secondDiceImage.setImageResource(R.drawable.dice_2)
            3 -> secondDiceImage.setImageResource(R.drawable.dice_3)
            4 -> secondDiceImage.setImageResource(R.drawable.dice_4)
            5 -> secondDiceImage.setImageResource(R.drawable.dice_5)
            6 -> secondDiceImage.setImageResource(R.drawable.dice_6) }

            secondDiceImage.contentDescription = dice2Roll.toString()
    }
}


/** this class is for the formation of random numbers
    the "fun roll" method is where the random numbers are formed **/
class Dice (private val numOfSides: Int){

    fun roll(): Int {
        return (1..numOfSides).random()
    }
    /** Remember to look for hints and issues provided by android studio **/
}

