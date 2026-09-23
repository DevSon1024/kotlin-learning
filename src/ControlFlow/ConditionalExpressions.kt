package ControlFlow

fun main(){
    // if
    val d: Int
    val check = true

    if (check){
        d = 1
    } else{
        d = 2
    }
    println(d) // Output: 1

    // no ternary operator oin kotlin
    // instead 'if' can be used as an expression
    // if there is only ine line of code per action, the curly braces are optional.
    val a = 1
    val b = 2
    println(if (a>b) a else b) // Output: 2

    println("---- End of If Else Conditions ----")
    // When
    /* use of when:
    * place the value we want to evaluate within parentheses()
    * place th branched within curly braces `{}`
    * use `->` in each branch to separate each check from the action to take if the check is successful.
    * */
    val obj = "hello"

    when (obj) {
        "1" -> println("One")
        "hello" -> println("Greeting")
        else -> println("Unknown")
        // Output: Greeting
    }

    // as a variable
    val result  = when (obj) {
        "1" -> "One"
        "hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result) // Output: Greeting

    // we can use when without subject 'obj'

    val trafficLightState = "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow Down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction) // Output: Stop
    println("---- End of When Conditions ----")

    // Ranges
    // we already learn the ranges useful in the for loop
    // we use range operation on the numbers and character

    // Loops
    // For Loop
    for (number in 1..5){
        print(number)
    }
    println()

    // we can also iterate the collections as well e.g.: List, set and Map
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes){
        println("Yummy, it's a $cake cacke !")
    }

    // While Loop
    // While
    var cakesEaten = 0
    while (cakesEaten < 3){
        println("Eat a cake!")
        cakesEaten++ // we have to write this increment or the code will go on infinite loop
    }

    // do-while
    // in this type of while loop we execute the code block first and then check the conditional expression
    var cakesBaked = 0
    while (cakesEaten < 3){
        println("Eat a cake!")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}
