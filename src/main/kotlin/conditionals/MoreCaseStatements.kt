package conditionals

fun main() {

    val n1 = 10

    val n2 = 20

    if(n1 > n2) {
        println(":)")
    } else if (n1 == 100) {

    } else {
        println(":(")
    }

    // if else to when expression

    when {
        (n1 > n2) -> println(":)")
        (n1 == 100) -> println("foo")
        else -> println(":(")
    }

    val age = 18
    when(age) {
        in 18..19 -> println("Teenager")
        !in 0..12 -> println()
        else -> println()
    }

}