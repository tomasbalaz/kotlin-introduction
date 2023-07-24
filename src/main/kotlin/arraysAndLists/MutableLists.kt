package arraysAndLists

fun main() {

    val names = mutableListOf(
        "Tomas", "Jamila", "Peter"
    )

    println(names[0])
    println(names.size)
    println(names.contains("Peter"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Peter"))
    println(names.isEmpty())
    names.remove("Tomas")
    names.add("Lucia")
    println(names)

    val mutableListOf = mutableListOf<Any>()
    println(mutableListOf)

}