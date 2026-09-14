fun main(){
    // Numbers: Main 2 type Integer and Floating point types
    //------------Integer types----------------

    //Integer (int)
    /*
    there are more subtypes in Integer datatypes like Byte, Short, Int and Long
    */
    // Int can store whole number from -2147483648 to 2147483647
    val myNum = 5
    println(myNum)

    // Byte
    /*store whole number from -128 to 127.
    use for save memory when we are sure that value
    is within these numbers criteria */
    val myNumByte: Byte = 100
    println(myNumByte)

    // Short
    /* store whole number form -32768 to 32767 */
    val myNumShort: Short = 5000
    println(myNumShort)

    // Long
    /*
    * The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
    * This is used when Int is not large enough to store the value.
    * or, we can end the value with an "L"*/
    val myNumLong: Long = 1500000000L
    println(myNumLong)

    //------------End of Integer types----------------

    //------------Floating point types----------------
    // Double
    /*
    * Double can be simple for writing and ca store 15 digits after decimal
    * so it is better for the working
    * */
    val myDoubleNum = 5.99
    println(myDoubleNum)

    // Float
    /*
    * float always end with F and can store 6 to 7 digits after decimal
    */
    val myNumFloat: Float = 5.75F
    println(myNumFloat)


    //------------End of Floating point types----------------

    // Character
    val myLetter = 'D'
    println(myLetter)

    // Boolean
    val myBoolean = true
    println(myBoolean)

    // String
    val myString = "Hello"
    println(myString)

    /* we can also write them with type specification e.g:
    * val myNum: Int = 5
    * val myDoubleNum: Double = 5.99
    * val myLetter: Char = 'D'
    * myBoolean: Boolean = true
    * myText: String = "Hello"
    */

}


