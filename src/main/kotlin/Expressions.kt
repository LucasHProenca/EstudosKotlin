fun main(){
//    if(326/72*15+93%13 == 62) {
//        println("Math is easy")
//    } else{
//        println("Math is hard")
//    }
//
//    val haveCat = true
//    val haveCatFood = true
//    if(haveCat && haveCatFood) {
//        println("Cat is happy")
//    } else {
//        println("Oh no!")
//    }
//
//    val age = 23
//    if (age > 18) println("Can drink alcohol") else println("Illegal to drink alcohol")

//    println("Please enter an animal")
//    val favouritePet = readLine()?:""
//    val availablePets = listOf("dog", "cat", "horse")
//
//    if(favouritePet in availablePets) {
//        println("We've your next best friend")
//    } else {
//        println("Sorry, $favouritePet is not available")
//    }

//    println("Enter your preferred coffee")
//    val coffee = readLine()?:""
//    val availableCoffee = listOf("Capuccino", "Mocha")
//    if(coffee !in availableCoffee) {
//        println("Sorry we don't have your coffee")
//    } else {
//        println("$coffee is available")
//    }

//    println("Please enter a number")
//    val input = readLine()?:""
//    val number = input.toInt()
//    if(number !in 0..9) {
//        println("Your number isn't single digit")
//} else {
//    println("$number is single digit")
//    }

//    val animals = arrayListOf<String>()
//    if (animals.isEmpty()) {
//        animals.add("cat")
//    }
//    println(animals)

//    val animals = arrayListOf("cat")
//    if (animals.add("horse")) {
//        println("Horse was successfully added")
//    }

//    val guestlist = setOf("John", "Alice", "Bob", "Carol")
//    println("Please enter your name")
//    val guest = readLine()?:""
//    if (guest in guestlist) {
//        println("Hey $guest, welcome")
//    } else {
//        println("Your name aren't on my list")
//    }

//    println("Please enter how many cats do you have")
//    val cats = readLine()?:"0"
//    val catsNumber = cats.toInt()
//
//    val hasCats = if (catsNumber in 1..3) {
//        "Few cats"
//    } else if (catsNumber in 4..6 ) {
//        "Several cats"
//    } else {
//        "Many cats"
//    }
//    println("You have $hasCats")

//    println("Please input what animal do you want")
//    val desire = readLine()?:""
//    val animalsAvailable = listOf("cat", "dog", "crocodile")
//
//    val animals = if (desire in animalsAvailable) {
//        "Are available"
//    } else {
//        animalsAvailable.isEmpty()
//        "Ty, but the animals have been adopted"
//    }
//    println(animals)

    println("Please input your age")
    val input = readLine()?:"0"
    var age = input.toInt()
    if (age == 0) age = 1

    val yourAge = if(age in 1..13) {
        "You are a child"
    } else if (age in 14..18) {
        "You are a teen"
    } else {
        "You are an adult"
    }
    println(yourAge)
}