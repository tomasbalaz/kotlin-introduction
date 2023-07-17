fun main() {
    val name = "Tomas"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println("".isEmpty())

    val age = 20

    //1st option of the message concatenation
    //val msg = name + " " + age

    //2nd option of the message concatenation
    //val msg = "${name} ${age}"

    //3th option of the message concatenation
   // val msg = "Name $name,  Age $age"

    //4th option of the message concatenation
    //val msg = "Name $name,  Age ${age + 1}"

    //5th option of the message concatenation
    val msg = "Name ${name.uppercase()},  Age ${age + 1}"

    val email = """
        Hello %s
            How 
        Are you
    """.trimIndent()

    println(email.format("Ana"))

    println(msg)
}