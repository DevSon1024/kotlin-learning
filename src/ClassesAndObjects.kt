// Class
// it is luke an object constructure or "blueprint" for creating objects
// e.g.: a car is an object.
// it has `properties` such as brand, weight and color, and functionss, such as drive and brake

// creation of class
// we use class keyword anf specify the of the class for creation of class


class Car{
    var brand = "" // property
    var model = "" // property
    var year = 0 //property
}

// property = it is a variable that belongs the that particular class

// creation of the object
// we will create obejct of car called c1
// then we acces the properlties of c1 by using the do syntax (.)
// just like we did to access array and string properties


fun main(){
    // object creation
    val c1 = Car()
    // accessing the properties and add some values in it.
    println(c1.brand) // it will give the output as blank as we do not added any value
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand) // Output: Ford
    println(c1.model) // Ootput: Mustang
    println(c1.year) // 1916

    //Multiple objects
    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand) // ford
    println(c2.brand) //
}
