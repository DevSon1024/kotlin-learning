fun main(){
    var greeting = "Hello"
    var name = "devson1024"


    println("'" + name[5]+ "'") // n

    // String length
    println("The Length of the string is: " + name.length) // 10

    // String functions
    var txt  = "Hello World"
    println(txt.lowercase())
    println(txt.uppercase())

    // Comparison Strings; shows 0 if both string are equal
    println(greeting.compareTo(name)) //-28

    // Finding a string in a string
    var txt2 = "Please locate where 'locate' occurs!"
    println(txt2.indexOf("locate")) // 7

    // String concatenation
    println(greeting + " " + name)
    // with plus() function
    println(greeting.plus(name))
    // or modern way with String Templates/Interpolation
    println("$greeting, My Name is $name")

}
