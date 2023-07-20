package conditionals

fun main() {

    val n1 = 10

    val n2 = 20

    //val result = n1 >= n2 ? ":)" : ":("
    val v1 = if (n1 >= n2) ":)" else ":("

    val v2 = if (n1 >= n2) ":)"
    else if (n1 == 100) "hooray"
    else ":("

    println(v1)
    println(v2)

}