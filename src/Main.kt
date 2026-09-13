fun main(){

    // println adds a new line at the end of the output
    println("Hello world")

    // print is used to print things without inserting new line
    print("Hello Wolrds")
    print("I am learning Kotlin")
    print("It is awesome")

    println(3+3)

    // variables declared with the 'var' keyword can be changed/modified,
    var name = "devson"
    name = "Devendra"
    println(name)

    /*
    we can declare a variable without assigning the value
    * and assign a value later
    * However this only possible when we specify the type:
    */
    var college: String
    college = "UCCCC"
    println(college)

    // but with 'val' it cannot be madified
    val birthyear = 1024
    // birthyear = 789 // we cannot reassinged value to the val
    println(birthyear)

    // we will use the 'val' when variable always store the same vale, like PI
    val pi = 3.14159265359
    println(pi)

    // we can combine variables and text with '+'
    println("Hello" + name)

    val firstName = "Devendra"
    val lastName = "Sonawane"
    val fullName = firstName + lastName
    println(fullName)

    // for numberic values it works as mathemetical operator
    val x = 5
    val y = 6
    println(x+y)
}

// this is single line comment
/*this is multi
line comments */