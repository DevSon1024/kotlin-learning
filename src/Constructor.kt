//as we created an object of class
// then specified the properties inside the class

//there is more faster wat to do that
// for that we can use constrictor

/*A constructor is like a special function,
* it is defined by using two parentheses () after the class name.
* we can specify the properties inside the parentheses (like passing parameters into a regular function).
* The constructor will initialize the properties when we create an object of a class.
* we have to remember to specify the type of the property/variable:
*/

class CarTwo(var brand:String, var model:String, var year:Int)

fun main(){
    val c1 = CarTwo("Ford", "Musrang",1969)
    // it is more seasier to specify multiple objects of one class
    val c2 = CarTwo("TATA", "Nano",2010)
    val c3 = CarTwo("Mahindra", "Bolero",2005)

    println(c1.brand)
}

