package functions

fun main() {
    println("hello".uppercase())
    greet(age = 23, name = "Tomas")
    greet("Alex")
    greet("Bob", 11)
}

fun greet(name: String, age: Int = -1) {
    println("Hello $name")
    if(age == -1) {
        println("Age not provided")
    }
    if(age >= 16) {
        println("$name is an adult")
    }
    else {
        println("$name not an adult")
    }
    println()
}