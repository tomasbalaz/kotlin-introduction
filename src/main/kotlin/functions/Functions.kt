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

    val (v1, v2) = twoValues()
    println("$v1 $v2")

    val (t1, t2, t3) =  threeValues()
    println("$t1 $t2 $t3")
}

//fun double(n: Int): Int {
//    return n * 2
//}

// fun double(n: Int): Int = n * 2

fun double(n: Int) = n * 2

//fun twoValues(): Pair<String, Int> {
//    return "Tomas" to 20
//}

//fun twoValues(): Pair<String, Int> = "Tomas" to 20
fun twoValues(): Pair<String, Int> = Pair("Tomas", 20)

//fun threeValues(): Triple<String, Int, Char> {
//    return Triple(
//        "Tomas",
//        20,
//        'Z')
//}


fun threeValues(): Triple<String, Int, Char>  = Triple("Tomas", 20, 'Z')


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