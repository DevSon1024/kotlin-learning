fun main(){
    // break
    // this statement if used to jump out of a loop.

    var i=0
    while (i<10){
        println(i)
        i++
        if (i==4){
            break
        }
    }

    // continue
    // this statement breaks one iteration, if a specified conndition occurs
    // then it continues the loop means it skips that conditioned value

    var j=0
    while (j<10){
        if (j==4){
            j++
            continue
        }
        println(j)
        j++
    }
}