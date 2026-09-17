fun main(){
    // function is simply block of code which runs only when we call it
    //we can pass data, know  parameters into a function.
    // functions are also known as methods
    // we already using it as
    /*
    * fun main(){
    * }
    * */

    // for creating our own function we will use 'fun' keyword before custom name
    fun myFunction(){
        println("First Function")
    }

    // calling a function
    myFunction() // it will print or execute code inside the function
    myFunction() // and it will print or execute code as many times we call it
    myFunction()

    println("---------------------")

    // Function parameters
    /*
    * parameters are specified after the function name, inside the parentheses.
    * we can add as many parameters as we want, we just need them separate with simple comma.
    * we have to specify the type of each parameter (e.g.: int, String etc.)
    * */

    fun myParaFunction(fname:String){
        println(fname + " Doe")
    } // here we created a function which take 'fname' as parameter when we call the function we have to add a value in parentheses.

    // this function calling will print the name attaching the 'Doe' at last
    myParaFunction("John") // John Doe
    myParaFunction("Jane") // Jane Doe
    myParaFunction("George") // George Doe

    println("---------------------")

    // Multiple Parameters
    fun mulParaFunction(fname:String, age:Int){
        println(fname+" is " + age)
    }
    mulParaFunction("John",35)
    mulParaFunction("Jane",32)
    mulParaFunction("George",15)

    println("---------------------")

    // Return Values
    // now we will use a function to return a value and assign it to be a variable.
    // we will use 'return' keyword and specify return type after the function's parentheses.
    // e.g: Int

    fun returnFunction(x:Int): Int{
        return (x+5)
    } // in this function we will not print value but just returning the mathematical calculation
    var result = returnFunction(30) // save the return value in this variable
    println(result) // and print this value

    println("---------------------")

    // returning 2 parameters

    fun returnTwoFunction(x:Int, y:Int): Int{
        return x+y
    }
    var returnTwo = returnTwoFunction(2,6)
    println(returnTwo)

    println("---------------------")

    // Shorter Syntac for return values
    fun shortFunction(x: Int, y:Int) = x+y
    var resultShort = shortFunction(5,6)
    println(resultShort)
}
