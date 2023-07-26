package loops

fun main() {

    val brand = "Tomas"

    for (l in brand) {
        println(l)
    }

    println()

    for (l in brand.indices.reversed()) {
        println("${brand[l]}")
    }
}
