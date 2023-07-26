package loops

fun main() {

    var number = 1
    while (number <= 5) {
        println("Number $number")
        ++number
    }

    println()

    var number2 = 5
    while (number2 >= 0) {
        println("Number $number2")
        --number2
    }

    println()

    val brand = "tomas"
    var index = brand.length -1
    while (index >= 0) {
        println("Brand ${brand[index]}")
        --index
    }

    println()

//    val brand2 = "tomas"
      val brand2 = arrayOf("t", "o", "m")
    var index2 = 0
    while (index2 <= brand.length -1) {
        println("Brand ${brand2[index2]}")
        ++index2
    }

}