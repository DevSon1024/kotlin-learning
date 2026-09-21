// Set
// they are unordered and only store unique items not duplicate like lists.
// we use setOf() function to create read only set

fun main(){
    // read only
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit) // Output: [apple, banana, cherry]

    // if we want to stop modifying the mutable list we can use 'casting'
    // where we can lock and convert MutableList into read only list
    val fruitLocked: Set<String> = fruit
    println(fruitLocked)

    // we cannot use index on set as they are unordered
    println("This set has '${readOnlyFruit.count()}' items")

    // 'in' operator for checking item existence
    println("banana" in readOnlyFruit) // Output: true

    // readOnlyFruit.add("dragonfruit") // we cannot add in the set as it is read only,
    // but we can add in 'fruit' set as it is mutable
    fruit.add("dragonfruit")
    println(fruit)
    fruit.remove("banana")
    println(fruit)
}