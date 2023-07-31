package classesAndObjects

fun main() {
    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 10000.0
    tv.turnOff()

    val phone = SmartDevice()
    phone.brand = "Apple"
    phone.price = 1200.00

    println("${tv.brand} ${tv.price}")
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()
    phone.turnOn()
    phone.getDeviceState()
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
        get() = field

    var isSwitchedOn:Boolean = false

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