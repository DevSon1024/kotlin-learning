package Functions

import kotlin.math.PI

// Exercise 1
/*
Write a function called circleArea that takes the radius of a circle
 in integer format as a parameter and outputs the area of that circle.
 */

fun circleArea(radius: Int): Double {
    return radius*radius*PI
}

// Exercise 2
// Rewrite the circleArea function from the previous exercise as a single-expression function
fun circleAreaTwo(radius: Int) = radius*radius*PI

// Exercise 3
/*
* You have a function that translates a time interval given un hours, minutes, and seconds into seconds.
* In most cases, you need to pass only one or two function parameters while the rest are equal to 0.
* Improve the function and the code that calls it by using default parameter values and named arguments so that the code is easier to read.
* */

fun intervalInSeconds(hours:Int = 0, minutes:Int = 0, seconds: Int = 0) = ((hours * 60)+minutes) * 60 + seconds


fun main(){
    println(circleArea(2)) //12.566370614359172
    println(circleAreaTwo(2)) //12.566370614359172

    println(intervalInSeconds(minutes = 1)) //60
    println(intervalInSeconds(1,3,4)) // 3784
    println(intervalInSeconds(hours = 6)) // 21600
    println(intervalInSeconds(seconds = 50)) // 50
    println(intervalInSeconds(seconds = 50, hours = 2)) // 7250
}