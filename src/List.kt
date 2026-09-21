// List

// List store items in the order that they are added, and allow for duplicate items.
// for readable list we use 'listOf()' function
// for mutable list we use 'mutableLisOf()' function.

/*
* when we ceate list, kotlin can infer the type of items strored
* To declare the type explicitly, we have to add the type within angled brackets (<>) after the lit=st declaration
* */

fun main (){
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // if we want to stop modifying the mutable list we can use 'casting'
    // where we can lock and convert MutableList into read only list
    val shapesLocked: List<String> = shapes
    println(shapesLocked)
    // shapesLocked[0] = "Shatkon" // throws error of not mutable

    // List are ordered we have to use index to acces them
    shapes[0] = "Katkon"
    println(shapes)
    println("the first item in the list is: ${readOnlyShapes[0]}")

    // for getting first item in list we use '.first()'
    // for getting last item in the list we use '.last()'
    println("the first item in the list is: ${readOnlyShapes.first()}")
    println("the last item in the list is: ${readOnlyShapes.last()}")

    // .count()
    // to get the number of items in a list, we use '.count()' function
    println("This list has '${readOnlyShapes.count()}' items")
    // Output: This list has '3' items

    // 'in' operator
    // to check that an item is in a list, use the 'in' operator
    println("circle" in readOnlyShapes) // Output: true

    // .add() and .remove()
    // for adding item in list we use '.add()'
    shapes.add("pentagon")
    println(shapes)

    // for removing item from list we use '.remove()'
    shapes.remove("Katkon")
    println(shapes)
}