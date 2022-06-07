package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generatesRandomNum(){
        val dice = Dice(6)
        val rollresult = dice.roll()

        assertTrue("The value of rollresult is not between 1 to 6", rollresult in 1..6)
    }

    }
