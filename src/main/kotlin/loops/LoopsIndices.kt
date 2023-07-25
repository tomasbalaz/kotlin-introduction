package loops

fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for(n in numbers) {
        println(n)
    }

    val letters = charArrayOf('A', 'B', 'C', 'D', 'E')
    for(letter in letters.indices) {
        //println(letter)
        println("$letter - ${letters[letter]}")
    }
    println("reverse")
    for(letter in letters.indices.reversed()) {
        //println(letter)
        println("$letter - ${letters[letter]}")
    }
}