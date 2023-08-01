package classesAndObjects

fun main() {
    val tv = SmartDevice(
        "Samsung",
        10000.0
    )
    tv.turnOff()

    val phone = SmartDevice(
        "Apple",
        1200.0
    )

    println("${tv.brand} ${tv.price}")
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()
    phone.turnOn()
    phone.getDeviceState()
}

// blueprint for objects
class SmartDevice(
    //properties variables val or var
    var brand: String,
    var price: Double,
    var isSwitchedOn: Boolean = false

) {
    //behaviours functions
    fun turnOn() {
        isSwitchedOn = true
        println("${brand} is switching on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("${brand} is switching off")
    }

    fun getDeviceState() {
        println("${brand} is on: $isSwitchedOn")
    }
}