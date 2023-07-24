package arraysAndLists

import kotlin.system.exitProcess

fun main() {
    val name: String = "Tomas"

    //val names = arrayOf("Tomas", "Jamila")

//    val names = arrayOf(
//        "Tomas", "Jamila", 2
//    )

    val names = arrayOf<String>(
        "Tomas", "Jamila"
    )

    names[0] = "Samir"

    println(names.contentToString())
    println(names[0])
    println(names[1])
//    println(names[2]) -> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    println(names.size)
    if ("hello" in names) {
        println("found")
    } else {
        println("not found")
    }


    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls.fill("*")
    println(arrayOfNulls.contentToString())

}