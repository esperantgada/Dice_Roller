package eg.esperantgada.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {

    //This tests if the Dice class and roll method functions well
    @Test
    fun generate_number(){
        val dice = Dice(6)
        val diceRolled = dice.roll()
        assertTrue("The value of roll result was not between 1 and 6", diceRolled in 1..6 )
    }
}