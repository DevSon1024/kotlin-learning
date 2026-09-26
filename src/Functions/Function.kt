package Functions

// we declare functions in kotlin with 'fun keyword'
// Function parameters are written within parentheses '()'.
// Each parameter must have a type, and multiple parameters must be separated by commas.
// the return type is written after the function's parentheses, separated by colon ':'.
// the body of a function is written within curly peaces '{}'.
// the 'return' keyword is used to exit or return something from a functino.

/*
* if a function doesn't return anything useful,
* the return type and 'return' keyword can be imitated
* */
fun sum(x: Int, y: Int): Int{
    return x+y
}

// Named arguments
/*
* For concise code, when calling our function,
* we don't have ti include parameter names.
* However, including parameter names does make our code easier to read
* This is called using named arguments.
* if we do include parameter names, then we ca write the parameters in any order.
* */

fun printMessageWithPrefix(message: String, prefix: String){
    println("[$prefix] $message")
}

// Default parameter values
/*
* we can define default values for our function parameters
* if we have default value and do provide particular parameter value then,
* as default the value will be printed
* */

fun printMessageWithPrefixDefault(message: String, prefix:String = "Info"){
    println("[$prefix] $message")
}

// Function without return

/*
* if our function doesn't return a useful value, then its return type is 'Unit'.
* 'Unit' is atype with only one value.
* we don't have to declare that Unit is returned explicitly in our function body.
* this means that we don't have to use the 'return' keyword or declare a return type:
* */

fun printMessage(message: String){
    println(message)
    // 'retutn Unit' or 'return' is optional
}

// Single-expression functions
/*
* To make our code more concise, we can use single-expression functions
* for example, the 'sum()' function can be shortened
* We can remove the curly braces '{}' and declare the function body using the assignment operator '='.
* when we use the assignment operator, Kotlin uses type inference, so we can also omit the return type.
* The sum() function then becomes one line:
* */
fun sumAgain(x:Int, y:Int) = x + y


// Early returns in fucntions
/*
* To stop the code in our function from being processed further than a certain point,we use the 'return' keyword.
* */

val registeredUsernames = mutableListOf("john_doe", "jane_smith")
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String{
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }
    if (email in registeredEmails){
        return "Email already registered. Please choose a different email."
    }

    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

fun main(){
    println(sum(1,2))

    // uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello") // [Log] Hello

    printMessageWithPrefixDefault("Hello", "Log")
    printMessageWithPrefixDefault("Hello")

    printMessage("Hello")

    println(sumAgain(1,2))

    println(registerUser("john_doe", "newjohn@example.com"))

    println(registerUser("new_user", "newuser@example.com"))
    println(registeredUsernames)
    println(registeredEmails)
}