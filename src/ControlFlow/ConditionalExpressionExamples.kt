package ControlFlow

import kotlin.random.Random
fun main(){
    // Conditional Expressions Practice
    // Exercise 1
    /*
    * Create a simple game where you win if throwing two dice results in the same number.
    * Use if to print You win :) if the dice match or You lose :( otherwise.

    * In this exercise, you import a package so that you can use the Random.nextInt() function to give you a random Int.
    * For more information about importing packages, see Packages and imports.*/

    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    if (firstResult == secondResult){
        println("You Win :)")
    } else{
        println("You Lose :(")
    }
    // -------------
    // Exercise 2
    /*
    * Using a when expression, update the following program
    * so that it prints the corresponding actions when you input the names of game console buttons.
    * Button | Action
    * ------------------
    * A      | Yes
    * B      | No
    * X      | Menu
    * Y      | Nothing
    * Other  | There is no such button
    * */
    val button = "B"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    // -------------
    // loop practice
    // -------------

    // Exercise 1
    /*
    * You have a program that counts pizza slices until there's a whole pizza with 8 slices. Refactor this program in two ways:
    * Use a while loop.
    * Use a do-while loop.
    */
    var pizzaSlices = 0
    while (pizzaSlices < 7){
        pizzaSlices++
        println(" There;s Only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("there are $pizzaSlices slices of pizza. Hooray! we have a whole pizza :D")

    // -------------
    // Exercise 2
    /*
    * Write a program that simulates the Fizz buzz game.
    * Your task is to print numbers from 1 to 100 incrementally,
    * replacing any number divisible by three with the word "fizz",
    * and any number divisible by five with the word "buzz".
    * Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
    */
    for (num in 1..100){
        when{
            num % 15 == 0 -> println("fizzbuzz")
            num % 3 == 0 -> println("fizz")
            num % 5 == 0 -> println("buzz")
            else -> println("$num")
        }
    }

    // -------------
    // Exercise 3
    /*
    * You have a list of words. Use for and if to print only the words that start with the letter l.
    * Hint:
    * Use the .startsWith() function for String type.
    * */
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words){
        if(word.startsWith("l")){
            println(word)
        }
    }
}