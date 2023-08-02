package classesAndObjects

fun main() {
    val tv = SmartDevice(
        "Samsung",
        10000.0
    )

    val tv2 = SmartDevice(
        "Samsung",
        10000.0
    )

    //comparing object properties via object.equals
    println(" == ${tv == tv2}")

    //comparing memory location
    println(" === ${tv === tv2}")

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

    val laptop = SmartDevice()
    println("${laptop.brand} ${laptop.price}")
    println(laptop)
}

// blueprint for objects
class SmartDevice(
    //properties variables val or var
    var brand: String,
    var price: Double,
    var isSwitchedOn: Boolean = false

) {
    constructor(): this("", 0.0)

    constructor(
        brand: String
    ): this(brand, 0.0)


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

    override fun toString(): String {
        return "SmartDevice(brand='$brand', price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}