package com.example.diceroller

class Dice (val numberSides : Int) {

    fun roll() : Int{
        return (1..numberSides).random()
    }
}