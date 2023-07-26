package loops

fun main() {

    val names = listOf("mary", "ali", "alex")

    for (name in names) {
        println(name)
    }

    println()

    names.forEach {
        println(it)
    }
}