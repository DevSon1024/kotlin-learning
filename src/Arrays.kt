fun main(){
    // Arrays
    /*
    * arrays  used for storing multiple values in a single variable,
    * instead of creating separate variable for each value
    * for creating a array we use arrayOf() function.
    * */

    val cars = arrayOf("Volvo", "BMW", "Tata", "Mahindra")
    // we cannot simply print the array like other datatypes
    // instead we have to first convert it into strings then we can pront
    // if we try to print it simply it will give us `Java array object's reference`

    // println(cars)
    println(cars.contentToString())

    // accessing the element of array with index number
    println(cars[0]) // Output: BMW

    //change element in array
    cars[0] = "Audi"
    println(cars[0])

    // array length/size
    println(cars.size) // output: 4

    // check if an Element exists in array
    // for that we will use 'in' operator
    if ("Volvo" in cars){
        println("It Exists")
    } else{
        println("It does not exist")
    }

    // Loop through an Array
    // we can access the elements with 'for loop' with 'in' operator
    for (x in cars){
        println(x)
    }
}