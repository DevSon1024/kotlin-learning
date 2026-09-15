fun main (){
    // if the condition is 'true' it will print the text
    /*
    * if (condition){
    *  block of code to be executed if the condition is true
    * }
    * */
    if (20>15){
        println("15 is lees than 20")
    }

    val x = 20
    val y = 18
    if (x>y){
        println("x is greter than y")
    }

    // else used to specify a block of code to be executed if the condition is false
    /*
    * if (condition){
    *   this block will execute of constion true
    * } else{
    *   this block will exceute if the condition is false
    * }
    * */

    val time = 20
    if (time < 18){
        println("Good Day.")
    } else{
        println("Good Evening.")
    } // Output: "Good Evening."

    // 'else if' to specify a new condition if the first condition is false
    /*
    * if (condition1){
    *   block will execute if consition1 is true
    * } else if (condition2){
    *   block will execute if condition1 is false and condition2 is true
    * } else{
    *   this will execute if both condition are false
    * }
    * */

    val timeAgain = 22
    if (timeAgain < 10){
        println("Good Morning.")
    } else if (timeAgain < 20){
        println {"Good Day."}
    } else{
        println("Good Evening.")
    } // Output: "Good Evening."

    // If..Else Expressions
    // In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it)

    val timeFinal = 20
    val greeting = if (timeFinal > 18){
        "Good Day."
    } else{
        "Good Evening."
    }
    println(greeting)

    // we can remove the {} curly braces if we only have one statement
    val timeFinalReally = 20
    val greetingReally = if (timeFinalReally > 20) "Good Day." else "Good Evening."
    println(greetingReally)
}