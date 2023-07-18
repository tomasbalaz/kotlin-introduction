package basics

fun main() {
    val name1 = "Tomas"

    val name2 = "Jamila"

    val name3 = "Tomas"

    val name4 = String("Saleh".toCharArray())

    // ==  and 'equals method' equals 'content' of the String

    println(name1 == name3)
    println("== ${name1 == name3}")

    println(name1.equals(name3))
    println(".equals ${name1.equals(name3)}")

    println("=== ${name1 === name4}")

}