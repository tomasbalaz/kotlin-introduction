package classesAndObjects

fun main() {
    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 10000.0

    val phone = SmartDevice()
    phone.brand = "Apple"
    phone.price = 1200.00

    println("${tv.brand} ${tv.price}")
    println("${phone.brand} ${phone.price}")
}

// blueprint for objects
class SmartDevice {
    //properties variables val or var
    var brand: String = ""
        get() = field
        set(value) {
            field = value
        }

    var price: Double = 0.0
        //behaviours functions
        get() = field

}