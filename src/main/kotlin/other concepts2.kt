fun main() {
    val bannedUserNames = listOf("Vinicius","Allan","Carol")
    val names by lazy { NewUser() }
    println("Enter your desired username")
    val input = readLine()?:""
    if (input !in bannedUserNames)
        names.message()
    else
        println("You aren't welcome here $input")
}

class NewUser{
    fun message() {
        println("Hello")
    }
}