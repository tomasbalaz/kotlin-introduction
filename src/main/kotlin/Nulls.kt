fun main() {

    var name = "jamila"
    // Not possible to assign
    //name = null

    println(name.uppercase())

    // How Kotlin safes before null pointer exception - null safety
    var brand: String? =null
    println(brand?.uppercase())
}