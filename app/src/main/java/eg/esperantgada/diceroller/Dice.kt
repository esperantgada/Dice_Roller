package eg.esperantgada.diceroller

// Single class that contains roll dice method
class Dice (private val numberSides : Int) {

    fun roll() : Int{
        return (1..numberSides).random()
    }
}