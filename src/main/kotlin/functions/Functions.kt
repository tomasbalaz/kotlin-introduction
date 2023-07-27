package functions

fun main() {
    println("hello".uppercase())
    greet(age = 23, name = "Tomas")
    greet("Alex", 16)
    greet("Bob", 11)
}

fun greet(name: String, age: Int) {
    println("Hello $name")
    if(age >= 16) {
        println("$name is an adult")
    }
    else {
        println("$name not an adult")
    }
}