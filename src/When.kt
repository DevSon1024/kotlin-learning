fun main(){
    // we can use 'when' expression instead of many if..else expression
    // it is easier to read as well
    // 'else' block required without it will throw error
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println(result) // Output: Thursday (day 4)
}