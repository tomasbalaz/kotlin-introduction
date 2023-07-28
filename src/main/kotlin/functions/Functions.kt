package functions

fun main() {
    println("hello".uppercase())
    greet(age = 23, name = "Tomas")
    greet("Alex")
    greet("Bob", 11)
    functionsAsArguments(bar = {
        println("bar as a function")

    })
    functionsAsArguments {
        println("bar as a function 2")
    }
    functionsAsArguments()

    val double = double(10)
    println(double)
}

//fun double(n: Int): Int {
//    return n * 2
//}

// fun double(n: Int): Int = n * 2

fun double(n: Int) = n * 2

fun functionsAsArguments(
    name: String = "",
    bar: () -> Unit = {}) {

    println("bar function")
    bar()
}

fun greet(name: String, age: Int = -1) {
    println("Hello $name")
    if(age == -1) {
        println("Age not provided\n")
        return
    }
    if(age >= 16) {
        println("$name $age - is an adult")
    }
    else {
        println("$name $age - not an adult")
    }
    println()
}