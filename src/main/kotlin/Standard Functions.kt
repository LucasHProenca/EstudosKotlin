import kotlin.random.Random

fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }.filter { it > 3 }
//        .let {
//            println(it)
//            println("Size of list is ${it.size}")
//        }
        .let(::println)

//    val name:String? = readLine()
//    name?.let {
//        println("Your name is $it")
//    }

//    val text:String? = readLine()
//    text?.let {
//        val input = it.toInt()
//        println("$input * 2 = ${input * 2}")
//    }

//    val newAnimals:ArrayList<String?> = arrayListOf<String?>()
//    for (i in 1..3) {
//        println("Input an animal")
//        val input:String? = readLine()
//        input?.let {
//            if (it == "") {
//                newAnimals.add(null)
//            } else {
//                newAnimals.add(it)
//            }
//        }
//        }
//    newAnimals.forEach{
//        it?.let{
//            println("Feeding the $it")
//        }
//    }
//   val clients = arrayListOf<String?>()
//    var finished = false
//    do {
//        println("Please enter a name")
//        val input:String? = readLine()
//        input?.let {
//            if (it == "stop") {
//                finished = true
//            } else if (it == "") {
//                clients.add(null)
//            } else {
//                clients.add(it)
//            }
//        }
//        clients.forEach{
//            it?.let{
//                println("Hello $it")
//            }
//        }
//    } while (!finished)

    with(Car5()) {
        speed = 80
        drive()
        println("Car is driving")
    }

    with(Person()) {
        name = "Marcos"
        lastName = "Godoi"
        age = 43
        basicInformations()
    }

    with(Store2()) {
        shoes = 10
        shirts = 20
        jackets = 5
        inventory()
    }

    val newCar = NewCar2().run {
        speed = 70
        drive()
        println("NewCar is driving")
        this
    }
    println(newCar)

    run {
        val car2 = NewCar2()
        car2.speed = 50
        car2.drive()
    }

    val newRestaurant = NewRestaurant().run {
        standardDish = "Strogonoff"
        todaysSpecial = "Pizza"
        menu()
        this
    }
    println(newRestaurant)

    val newLaptop = MyLaptop().run {
        turnOff()
        turnOn()
    }

    val yourCar = YourCar().apply {
        speed = 50
        color = "red"
        startCar()
    }.also {
            println("Car is running")
        }

    Lock1().unlock(Key1().apply {
        secretCode = "123"
        carve()
    })

    CoffeeShop1().sellCoffee(CupOfCoffee().apply {
        println("Please enter your name")
        val input = readLine() ?: ""
        name = input
        preparingTheCoffee()
        println("Serving coffee to $name")
        println(this)
    })

    val bookStore = Book1().apply {
        printBook()
    }.also {
            println("Sending an e-mail")
        }

    val carsBuilt = CarsBuilt().apply {
        update()
    }.also {
            println("Notifying the police")
        }

    for (i in 1..10) {
        val number1 = Random.nextInt(100)
        val evenOrNull = number1.takeIf { it % 2 == 0 }
        println(evenOrNull)
    }

    val listOfNumbers = listOf(2, 3, 8, 159, 654, 1005, 325, 482)
    println(listOfNumbers)
    val newNumbers1 = arrayListOf<Int>()
    for (number in listOfNumbers) {
        number.takeIf { it % 2 == 0 }?.let { newNumbers1.add(it) }
    }
    println(newNumbers1)

    val listOfClients = listOf("Lucas", "Anna", "Amanda", "Maiara", "Alice", "Luiz")
    println(listOfClients)
    val newClients = arrayListOf<String>()
    for (clients in listOfClients) {
        clients.takeUnless { it[0] == 'A' }?.let { newClients.add(it) }
    }
    println(newClients)

    val numbers3 = arrayListOf<Int>()
    for (i in 1..10) {
        println("Please enter a number")
        val input = readLine() ?: ""
        val number = input.toInt()

        number.takeIf { it % 2 != 0 }.takeUnless { it == 3 || it == 13 }?.let { numbers3.add(it) }
    }
    println(numbers3)
}

class Car5 {
    var speed = 50
    fun drive() {
        println("Driving at speed $speed kph")
    }
}

class Person {
    var name = "Lucas"
    var lastName = "Proença"
    var age = 24
    fun basicInformations() {
        println("My name is $name $lastName and i'm $age yo")
    }
}

class Store2 {
    var shoes = 0
    var shirts = 0
    var jackets = 0
    fun inventory() {
        println("We've $shoes pairs shoes, $shirts shirts and $jackets jackets at the inventory")
    }
}

class NewCar2 {
    var speed = 10
    fun drive() {
        println("Car is driving at $speed")
    }
}

class NewRestaurant {
    var standardDish = ""
    var todaysSpecial = ""
    fun menu() {
        println("Our standard dish is $standardDish and the special tonight is $todaysSpecial")
    }
}

class MyLaptop {
    fun turnOn() {
        println("Turned the laptop on")
    }

    fun turnOff() {
        println("Turned the laptop off")
    }
}

class YourCar {
    var speed = 50
    var color = "blue"
    fun startCar() {
        println("Starting the car, speed is $speed, color is $color")
    }
}

class Lock1 {
    fun unlock(key: Key1) {
        println("Unlocked lock with key $key")
    }

}

class Key1 {
    var secretCode = ""
    fun carve() {
        println("Carving the key with code $secretCode")
    }
}

class CoffeeShop1 {
    fun sellCoffee(name: CupOfCoffee) {

    }
}

class CupOfCoffee {
    var name = ""
    fun preparingTheCoffee() {
        println("Preparing the coffee for $name")
    }
}

class Book1 {
    fun printBook() {
        println("Printing a book")
    }
}

class CarsBuilt {
    fun update() {
        println("Updating a new car")
    }
}

