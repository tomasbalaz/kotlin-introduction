package loops

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)

    for (num in nums) {
        if(num % 2 == 0) {
            continue
        }
        if(num > 6) {
            break
        }
        println(num)
    }

//    'break' and 'continue' are only allowed inside a loop
/*
    nums.forEach {
        if(it == 2) continue
     }

*/
}

