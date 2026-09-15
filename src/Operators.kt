fun Operators(){
    var x = 10
    val y = 5

    //----------Arithmetic Operator-----------

    // Addition
    println(x+y) // 15

    // Substraction
    println(x-y) // 5

    // Multiplication
    println(x*y) // 50

    // Division
    println(x/y) // 2

    // Modules = Returns the division remainder
    println(x%y) // 0

    // Increment = Increase the value by 1
    println(++x) // 11

    // Decrement = Decreases the value by 1
    println(--x) // 10

    //----------Assignment Operator-----------
    // '='
    var z = 20
    println("z = "+ z) // 20

    // '+='
    z += 3
    println("z = "+ z) // 23
    // '-='
    z -= 3
    println("z = "+ z) // 20
    // '*='
    z *= 3
    println("z = "+ z) // 60
    // '/='
    z /= 3
    println("z = "+ z) // 20
    // '%='
    z %= 3
    println("z = "+ z) // 2

    //----------Comparison Operator-----------
    // output will always be in true/false

    println(x==y) // false
    println(x!=y) // true
    println(x>y) // true
    println(x<y) // false
    println(x>=y) // true
    println(x<=y) // false

    //----------Logical Operator-----------
    // '&&' = Returns true if both statements are true
    println(x < 5 && x < 10) // false

    // '||' = Returns true if one of the statements is true
    println(x < 5 || x < 4) // false

    // '!' = Reverse the result, returns false of the result is true
    var myBool = false
    println(!myBool) // true

}

fun main(){
    Operators()
    var sum1 = 100+50
    var sum2 = sum1+250
    var sum3 = sum2+sum2
    println(sum3)
    sum3 = 40
    println(sum3)
}