// Maps
// it sore items in key-value pairs.
// we can  access the value by referencing the key
// Maps are useful if we want to look up a value without using a numbered index, like in a list.

// key should be unique value can be duplicate.

// we use mapOf() function to create Map.
// for mutable Map we use 'mutableMapOf()' function.
/*
* when we create Map, kotlin can infer the type of items stored
* To declare the type explicitly, we have to add the type within angled brackets (<>) after the Map declaration
* */
fun main(){
    // we use 'to' operator to provide a value to a key.
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    // we can convert mutable Map into read-only by assigning it to a 'Map'
    val juickMenuLocked: Map<String,Int> = juiceMenu

    // to access map we use key as index to find particular value
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}") // Output: 100
    // if we try to access a key that does not exist it will show use 'null' instead of error
    println("The value of mango juice is: ${readOnlyJuiceMenu["mango"]}") // Output: null

    // add key-value in the Map
    juiceMenu["coconut"] = 150
    println(juiceMenu)

    // remove key-value from the Map
    juiceMenu.remove("orange")
    println(juiceMenu)

    // to get the number of items in a map
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    // to check of particular key available or not
    println(readOnlyJuiceMenu.containsKey("kiwi")) // Output: true

    // to obtain a collection of the keys / values  we use '.keys' and '.values' properties
    println(readOnlyJuiceMenu.keys) // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values) // [100, 190, 100]

    // to check  a key or value is in a map we use the 'in' operator
    println("orange" in readOnlyJuiceMenu.keys) // true

    // we do no have to use the 'keys' property every time
    println("orange" in readOnlyJuiceMenu) // true

    println(200 in readOnlyJuiceMenu.values) //false

    // Exercise for Map:
    // Define a map that relates integer numbers from 1 to 3 to their corresponding spelling.
    // Use this map to spell the given number.
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 3
    println("$n is spelled as '${number2word[n]}'")
}
