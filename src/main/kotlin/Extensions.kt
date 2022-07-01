fun main() {
    val name = "Michael"
    println(name.slim())

    println(name.betterLength)

    println("Some string".getCustomName())
    println(3.getCustomName())
    println(2.5F.getCustomName())

    val list = arrayListOf(3,4,5,6,8,2,9)
    println(list.howMany())

    Book2.printMe()
    String.getClassType()
    Double.getClassType()
}

fun String.slim() = this.substring(2, length-2)

val String.betterLength: Int
get() = 200

fun String.getCustomName() = "A string of characters"
fun Int.getCustomName() = "A integer number"
fun Float.getCustomName() = "A floating point number"

fun ArrayList<Int>.howMany() = "This list contains $size elements"

class Book2 {
    companion object{}
}

fun Book2.Companion.printMe() {
    println("Book has been printed")
}

fun String.Companion.getClassType() {
    println("This is a string class")
}

fun Double.Companion.getClassType() {
    println("This is a double class")
}