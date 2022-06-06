import kotlin.random.Random

fun main(){
//    println("Input Something")
//    val userInput = readLine()
//    println("You wrote: $userInput")
    //This is used for type whatever you want in the console, after the fun run

//    println("Input a number")
//    val userInput = readLine()?:""
//    println("Double is: ${userInput.toInt() * 2}")

//    println(Random.nextInt())
//    println(Random.nextInt(10))
//    println(Random.nextInt(10,20))

//    println("What is your name?")
//    val userInput = readLine()
//    println("Welcome,$userInput")

//    println("What is your favorite number")
//    val number = readLine()?:""
//    val result = number.toInt() / 5
//    println("$number / 5 = $result")

    println("What's your birth year?")
    val currentYear = 2022
    val birthYear = readLine()?:""
    val age = currentYear - birthYear.toInt()
    println("Your age is: $currentYear - $birthYear = ${age} or maybe ${age-1} ")

}