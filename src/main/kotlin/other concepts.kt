import kotlin.random.Random

fun main() {
    val value = "Testing my strings"
    if (value is String) {
        println("This string has ${value.length} characters")
    }

    val myCar: Car15 = getCar()
    if (myCar !is BMW3) println("This is not my favourite brand")
    if (myCar is BMW3) myCar.drive()

    val bmwCar = myCar as? BMW3
    bmwCar?.drive()

    val myNetworkService: NetworkService = network()
    for (i in 1..10) {
        println("$i")
        (myNetworkService as? FTPService)?.transferFile()
    }

    val myAnimals: ArrayList<Animal2> = animalsList()
    myAnimals.forEach { animal2 ->
        (animal2 as? Dog3)?.bark()
        (animal2 as? Cat)?.purr()
    }

    lateinit var networkService: String
    networkService = getNetworkService2()
    println(networkService)

//    Exactly the same as the teacher, but still haven't working

    val myCountry: Country = Country().apply { setName("Sweden") }
    println("Hello ${myCountry.getName()}")

    lateinit var message: String
    val primeNumbers = listOf(2, 3, 5, 7, 11, 13, 17, 23)
    message = "The chosen prime number is ${selectPrimeNumber(primeNumbers)}"
    println(message)

    val someLargeVariable: String by lazy {
        "Some large value"
    }

    if (Random.nextInt() % 2 == 0) println(someLargeVariable)

    val list by lazy { generateList() }
    println("Should the list be generated? (yes/no)")
    val input = readLine() ?: ""
    if (input == "yes") println(list)
}

open class Car15

class BMW3 : Car15() {
    fun drive() {
        println("Driving the car")
    }
}

fun getCar(): Car15 = BMW3()

open class NetworkService

class FTPService : NetworkService() {
    fun transferFile() {
        println("Network file has been transfer")
    }
}

fun network(): NetworkService {
    return if (Random.nextInt() % 2 == 0) NetworkService()
    else FTPService()
}

abstract class Animal2

class Cat : Animal2() {
    fun purr() {
        println("Purr")
    }
}

class Dog3 : Animal2() {
    fun bark() {
        println("Bark")
    }
}

fun animalsList(): ArrayList<Animal2> {
    val animals = arrayListOf<Animal2>()
    for (i in 1..20) {
        animals.add(
            if (Random.nextInt() % 2 == 0) Dog3()
            else Cat()
        )
    }
    return animals
}

fun getNetworkService2() = "Network service"

class Country {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name
}

fun selectPrimeNumber(primes: List<Int>) = primes.random()

fun generateList(): List<Int> {
    val integers = arrayListOf<Int>()
    for (i in 1..1000) integers.add(Random.nextInt(1000))
    return integers
}
