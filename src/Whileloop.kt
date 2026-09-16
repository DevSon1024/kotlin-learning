fun main(){
    //While Loop
    // this loop loops through a block of code as long as a specified condition is true.
    /*
    * while(condition){
    *  code block to be executed
    * }
    * */

    var i =0
    while (i<5){
        println(i)
        i++
    }

    // Do..While
    // this loop execute the code block once, before checking if the condition is true,
    // then it will repeat the loop as long condition become false
    /*
    * do {
    *  code blick to be executed
    * }
    * while (condition);
    * */

    var j = 0
    do {
        println(j)
        j++
    }
    while(j>5) // false condition still it will print 0 as output
}
