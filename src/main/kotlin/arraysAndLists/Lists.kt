package arraysAndLists

fun main() {

    val names: List<String> = listOf(
        "Tomas", "Jamila", "Peter"
    )

    println(names[0])
    println(names.size)
    println(names.contains("Peter"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Peter"))
    println(names)
}