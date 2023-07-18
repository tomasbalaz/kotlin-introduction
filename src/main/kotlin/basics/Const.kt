package basics
// 'Pi' has been known before code execution - difference between val PI = 3.14
// -> static final -> Java Example
const val PI = 3.14


// !!!! Const 'val' initializer should be a constant value
//const val PI = getPiValue()

val pi = getPiValue()

fun main() {

    val name = "Jamal" // value -> read only
    // final -> Java example
   // name = ""

    var i = 0 // muttable
    i = 2
}

fun getPiValue(): Double = 3.14