// when a function is declared inside a class, itis known as a class function, or memeber funciton.

class CarThree(var brand: String, var model: String, var year: Int){
    // Class functions
    fun drive(){
        println("Vroom!")
    }

    // here we are giving a parameter for maximum speed.
    fun speed(maxSpeed: Int){
        println("Max Speed is: $maxSpeed")
    }
}

fun main(){
    // this c1 object will have access to all the CarThree class function along with all proeprties.
    val c1 = CarThree("Ford", "Mustanf",1969)

    c1.drive()
    // we can add simply value here
    c1.speed(200)
}