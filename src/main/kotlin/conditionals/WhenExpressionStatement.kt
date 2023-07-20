package conditionals

fun main() {

    val gender = "F"

    val g = when(gender) {
        "F" -> "Female"
        "M" -> "Male"
        else -> {
            println("Unknown Gender")
        }
    }

    println(g)
}