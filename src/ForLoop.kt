fun main(){
    // for loop
    // this loop basically used when we want to loop though all of the elements.
    // we use 'for' loop with 'in' operator to loop through these elements
    val cars = arrayOf("Volvo", "BMW", "Tata", "Mahindra")
    for (x in cars){
        println(x)
    }

    // not just strings array but we can loop though any type of aray we want to.
    val nums = arrayOf(1,2,56,8,6,9)
    for (x in nums){
        println(x)
    }

}