fun main() {
//    var animal = "cat"
//    var action: String = ""
//    when(animal) {
//        "cat" -> {
//            action = "pet it"
//        }
//        "dog" -> {
//            action = "feed it"
//        }
//        else -> {
//            action = "google it"
//        }
//    }
//
//    println("When you meet a $animal you should $action")
//
//    var result = ""
//    val number = 2345
//    when(number % 2) {
//        0 -> result = "Number is even"
//        1 -> result = "Number is odd"
//    }
//    println(result)

//    val month = "January"
//    val days = when(month) {
//        "January" -> 31
//        "February" -> 28
//        "March" -> 31
//        else -> 30
//    }
//    println(days)

//    val month = "January"
//    val days = when(month) {
//        "January", "March", "May" -> 31
//        "February" -> 28
//        else -> 30
//    }
//    println("The month of $month has $days days")

//    println("Please input your name")
//    val name = readLine()?:""
//    when(val length = name.length) {
//        in 1..5 -> println("A name with $length characters is short")
//        in 6..10 -> println("A name with $length characters is medium")
//        else -> println("A name with $length characters is long")

//    println("Please input how many meals do you have a day")
//    val input = readLine()?:""
//    val meals = input.toInt()
//    when(val mealsAmount = meals) {
//        in 0..2 -> println("Only $mealsAmount meals it's not enough for you")
//        in 3..4 -> println("Only $mealsAmount meals it's great for you")
//        else -> println("Only $mealsAmount meals it's more than the necessary for you")
//    }

//    println("Please input what time it is")
//    val input = readLine()?:""
//    var hour = input.toInt()
//    if (hour> 23) hour = 23
//    when(hour) {
//        in 6..11 -> println("Good morning")
//        in 12..14 -> println("It's noon")
//        in 15..17 -> println("Good afternoon")
//        in 18..21 -> println("Good evening")
//        else -> println("Good night")
//    }

    println("Please input your name")
    val input = readLine()?:""
    when(input[0]) {
        'A', 'B', 'C' -> println("Hello $input, welcome")
        in 'D'..'F' -> println("Hello $input how are you")
        else -> println("Hi")
    }
}