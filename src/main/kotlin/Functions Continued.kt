fun main() {
    println(multiply(5))
    println(multiply(7,9))

    println(sayHello("John"))
    println(sayHello(listOf("Alice", "Bob", "Carol")))

    printSize("Hello how are you")
    printSize(8)

    feedAnimal("Cat")
    feedAnimal(listOf("Cat", "Dog", "Shark"))

    var parakeets = 5
    buyMoreParakeets(parakeets)
    println("You now have $parakeets parakeets")

    sayHelloGuys("Alice", "Bob", "Carol", "David")

    println(sumOfIntegers(4,8,5,10,23,30))
    println(sumOfIntegers(9,121,343,23,121))

    printHelloGuys(5,"Mary","James","Alex")

    market("Soda", 10.00)

    val products = mapOf(Pair("Cake", 3.50), Pair("Soda", 10.00))
    market(products)

}

fun market(product: String, price: Double?) {
    println("$product will cost ${price?.times(1.2)}")
}

fun market(products: Map<String, Double>) {
    products.forEach {(product, price) ->
        market(product, price)

    }
}

fun multiply(number: Int) = number * 2

fun multiply(number:Int, multiplier: Int) = number * multiplier

fun sayHello(person: String) {
    println("Hi $person")
}

fun sayHello(people: Collection<String>) {
    for (person in people)
        println("Hi there $person")
}

fun printSize(message: String) {
    println("'$message' has a size of ${message.length}")
}

fun printSize(size: Int) {
    var message = ""
    for (i in 1..size) {
        message += "a"
    }
    println("A message of size $size is $message")
}

fun feedAnimal(animal: String) {
    println("Feeding the $animal")
}

fun feedAnimal(animals: Collection<String>) {
    for(animal in animals) {
        feedAnimal(animal)
    }
}



fun buyMoreParakeets(parakeets: Int) {
    val parakeets = 3
}

fun sayHelloGuys(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun printHelloGuys(count: Int, vararg names: String) {
    for(name in names)
        for(i in 1..count){
            print("Hello $name -")
        }
    println()
}

