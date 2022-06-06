fun main() {
//    for(i in 1..10) {
//        sayHello()
//    }
//
//    var i = 5
//    do {
//        i --
//        printAlphabet()
//    } while (i > 0)

//    var j = 3
//    do {
//        i --
//        number()
//    } while (j > 0)

//    for(i in 1..3) {
//        number()
//    }
//    for(i in 1..3) {
//        userName()
//    }

//    doubleMessage(5, "5 * 2 = ")
//    doubleMessage(8)
//
//    double(5)
//    for (i:Int in 1..10) {
//        double(i)
//    }
//
//    val people:List<String> = listOf("Anna", "Bob", "Carol")
//    sayHelloToPeople(people)

//    val people = listOf("Anna", "Bob", "William")
//    for (person in people) {
//        val message = personalisedGreeting(person)
//        println(message)
//    }
//
//    val r = 63
//    val area = calculateCircleArea(r)
//    println("A circle with the radius $r has an area of $area")
//
//    for (i in 1..3)
//        println(addition(i*5, i*9))
//
//    val products = hashMapOf(Pair("shoes", 29.99), Pair("Socks", 5.99), Pair("Jeans", 39.99))
//    for (item in products.keys) {
//        val finalPrice = addTax(products[item])
//        println("$item cost $finalPrice")
//    }

    println("Please enter an animal")
    val input = readLine()?:""
    val animals = animalsLife(input)
    println("$input normally lives $animals years")

}
fun animalsLife(name:String): Int {
    val animals = when(name) {
        "Cats" -> 15
        "Dogs" -> 10
        "Rabbit" -> 12
        else -> 20
    }
    return animals

//fun sayHello() {
//    println("Hello everyone")
//}
//
//fun printAlphabet() {
//    println("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z")
//
//}
//
//fun number() {
//    println("Please enter a number")
//    val input = readLine()?:""
//    val number = input.toInt()
//    val result = number * 17
//    println("Your result is $result")
//}
//fun userName() {
//    println("Please enter your name")
//    val name = readLine()?:""
//    println("Please enter your birth year")
//    val input = readLine()?:""
//    val year = input.toInt()
//    val currentYear = 2022
//    println("Hey $name you are ${currentYear - year - 1} or ${currentYear - year} years old")
//}
//
//fun double(number: Int) {
//    println("Double $number is ${number * 2}")
//}
//
//fun sayHelloToPeople(people: Collection<String>) {
//    for(person: String in people) {
//        println("Hello $person")
//    }
//}
//fun doubleMessage(number: Int, message: String = "Double is") {
//    println("$message ${number * 2}")
//}
//
//fun personalisedGreeting(person: String): String {
//    val greeting = when(person[0]) {
//        'A' -> "Are you ok $person"
//        'W' -> "What's up $person"
//        else -> "Hi $person"
//    }
//    return greeting
//}
//
//fun calculateCircleArea(radius: Int) = 3.1415 * radius * radius
//
//fun addition(p1: Int, p2: Int) = p1 +p2
//
//fun addTax(price: Double?) = price?.times(1.2)


}

