// Inheritance (subclass and superclass)

// we can simply inherit the properties of ControlFlow.main or big class to small classes
// with small class's own properties

//there are 2 categories
// subclass = class the inherits from another class
// superclass = the class being inherited from

// Superclass
open class MyParentClass{
    val x = 5
}
// we used 'open' that this class's properties and functions can be inherited by other classes

// Subclass
// to inherit tha class we have to specify the subclass name with semicolan (:) and then superclass
class MyChildClass: MyParentClass(){
    fun myFunction(){
        println(x) // x is now inherited from superclas
    }
}

// create an object of MyChild classs and call our function
fun main(){
    val myObj = MyChildClass()
    myObj.myFunction()
}