fun main(){
    // ranges
    // especially used in 'for' loop only
    // we can create ranges of values with '..'

    // ranges for alphabets
    for (chars in 'a'..'x'){
        println(chars)
    }

    // ranges for numbers
    for (nums in 5..15){
        println(nums)
    }

    // Break a range

    for(nums in 5..15){
        if (nums==10){
            break
        }
        println(nums)
    }
    // Continue a range

    for(nums in 5..15){
        if (nums==10){
            continue
        }
        println(nums)
    }
}