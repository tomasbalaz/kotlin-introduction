package arraysAndLists

fun main() {

    val names = listOf(
        "Tomas", "Jamila", "Peter"
    )

    val j = names[0]
    val ja = names[1]
    val a = names[2]

    val (one, two, three) =  names
    println("$one $two $three ")
}