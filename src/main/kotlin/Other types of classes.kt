import kotlin.random.Random

fun main() {

    val myUser = User("John", "John@gmail.com", "John is cool")
    println(myUser)
    val user2 = User("John", "John@gmail.com", "John is cool")
    println(myUser == user2)
    val user5 = user2.copy(email = "lucasproenca@gmail.com")
    println(user5)

    val user3 = RegularUser("John", "John@gmail.com", "John is cool")
    val user4 = RegularUser("John", "John@gmail.com", "John is cool")
    println(user3 == user4)

    val customers = arrayListOf<CustomerInformations>()
    customers.add(CustomerInformations("Alice", "alice@gmail.com", 7))
    customers.add(CustomerInformations("Bob", "bob@gmail.com", 10))
    customers.add(CustomerInformations("Carol", "carol@gmail.com", 12))
    println(customers)

    val newCustomer = customers[1].copy(email = "bobsnewemail@gmail.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)

    val article1 = NetworkServer("League of Legends", "Champions", 10)
    val article2 = NetworkServer("World of Warcraft", "Classes", 8)
    println(article1)
    println(article2)

    val updateArticle1 = article1.copy(title = "LOL")
    println(updateArticle1)

    when(Colors.RED) {
        Colors.RED -> println("You chose red")
        Colors.GREEN -> println("You chose green")
        Colors.BLUE -> println("You chose blue")
    }
    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)

    var currentState = Games.STARTED
    for (i in 1..30) {
        println("${currentState.ordinal + 1}. $currentState")
        currentState = gameStates(currentState)
    }

    val olympics = Medal()
    println(olympics.getMedal("2nd place"))
    println(olympics.getMedal("7 place"))
    println(olympics.getPosition(Olympics.GOLD))
    println(olympics.getPosition(Olympics.BRONZE))

    val somePlant = getPlant()
    when(somePlant) {
        is Fruit -> println("Sweet")
        is Vegetable -> println("Tasty vegetable")
    }

    val myVehicle = getVehicle()
    when(myVehicle) {
        is Car10 -> println("A car is faster")
        is Bicycle -> println("A bicycle is more healthy")
    }

    for (i in 1..10) {
        val prize = lottery()
        when(prize) {
            is Vacation -> println("I'm going on holiday")
            is Car11 -> println("Wow i won a car")
            is GiftCard -> println("Yay, a gift card")
        }
    }

    val myCar = Car12()
    myCar.drive()

    val myComputer = Computer()
    myComputer.bootUp()

    val myAirplane = Airplane3()
    myAirplane.takeOff()
}

data class User(
    val name: String, val email: String, val password: String
)

class RegularUser(
    val name: String, val email: String, val password: String
)

data class CustomerInformations(
    val name: String, val email: String, val productsBought: Int
)

fun sendEmail(customers: ArrayList<CustomerInformations>) {
    customers.forEach { println("Sending an email to ${it.email}") }
}

data class NetworkServer(
    val title: String, val content: String, val numberOfReaders: Int
)

enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(20),
    BLUE(12)
}

enum class Games {
    STARTED,
    PLAYING,
    GAMEOVER
}

fun gameStates(currentState: Games): Games {
    return when(currentState) {
        Games.STARTED -> Games.PLAYING
        Games.PLAYING -> Games.GAMEOVER
        Games.GAMEOVER -> Games.STARTED
    }
}

enum class Olympics(val position: String) {
    GOLD("1st place"),
    SILVER("2nd place"),
    BRONZE("3rd place"),
    NONE("other")
}

class Medal {
    fun getMedal(position: String): Olympics {
        return when(position) {
            "1st place" -> Olympics.GOLD
            "2nd place" -> Olympics.SILVER
            "3rd place" -> Olympics.BRONZE
            else -> Olympics.NONE

        }
    }

    fun getPosition(olympics: Olympics) = olympics.position
}

abstract class Plant

sealed class Fruit: Plant()

class Apple2: Fruit()

sealed class Vegetable: Plant()

class Potato: Vegetable()

fun getPlant(): Plant = Apple2()

abstract class Vehicle

sealed class Car10: Vehicle()

sealed class Bicycle: Vehicle()

class BMW2: Car10()

class Pegasus: Bicycle()

fun getVehicle(): Vehicle = Pegasus()

fun lottery(): Prizes {
    val number = Random.nextInt(3)
    return when(number) {
        0 -> FranceHoliday()
        1 -> VW()
        else -> Dollar10()
    }
}

sealed class Prizes

sealed class Car11: Prizes()

sealed class Vacation: Prizes()

sealed class GiftCard: Prizes()

class VW: Car11()

class FranceHoliday: Vacation()

class Dollar10: GiftCard()

class Car12 {
    var speed = 100
    private val engine = Engine()
    fun drive () {
        engine.run()
        println("Driving at $speed")
    }

    private inner class Engine {
        val rpm = 300
        fun run() {
            this@Car12.speed = 150
//            this@Car12.drive()
            println("Engine running")
        }
    }
}

class Computer {

    fun bootUp() {
        println("Booting up computer")
        val os = OperatingSystem()
        os.start()
        println("Computer ready")
    }
    inner class OperatingSystem {
        fun start() {
            println("OS started")
        }
    }
}

class Airplane3 {
    fun takeOff() {
        println("Starting engine 1")
        val engine1 = StartingEngine()
        engine1.start()
        println("The airplane is ready to take off")
    }
    private inner class StartingEngine {
        fun start() {
            println("Starting engine 2")
        }
    }
}
