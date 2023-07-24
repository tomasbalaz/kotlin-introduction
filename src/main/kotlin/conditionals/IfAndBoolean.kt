package conditionals

fun main() {

    // check when boolean is not null
    val isAdult = true
    if (isAdult) {
        println("not null and true")
    } else {
        println("false or null")
    }


    // check when boolean is null
    val isAdult2 : Boolean? = null
    if (isAdult2 == true) {
        println("not null and true")
    } else {
        println("false or null")
    }
}