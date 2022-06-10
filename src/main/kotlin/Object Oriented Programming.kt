fun main() {
    //starting Objects
    val myCar = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(75)

    // Exercise 1

    val myAnimal = Animal()
    myAnimal.picture()

    myAnimal.name = "Cat"
    myAnimal.topSpeed = 200
    myAnimal.picture()

    // Exercise 2

    val myMath = Math()
    println("3 + 5 = ${myMath.add(3, 5)}")
    println("3 - 2 = ${myMath.sub(3, 2)}")
    println("6 / 2 = ${myMath.divided(6, 2)}")
    println("3 * 5 = ${myMath.multiplied(3, 5)}")

    // Exercise 3

    val jetpack = Jetpack()
    jetpack.burn(10)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(2)
    println("User height is ${jetpack.userHeight}")
    jetpack.burn(5)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(8)
    println("User height is ${jetpack.userHeight}")

    // Exercise 4 made by me

    val calculator = Calculator()
    calculator.adds(6)
    println("0 + 6 = ${calculator.total}")
    calculator.subs(2)
    println("6 - 2 = ${calculator.total}")
    calculator.mult(5)
    println("4 * 5 = ${calculator.total}")
    calculator.divide(4)
    println("20 / 4 = ${calculator.total}")
    calculator.reset()
    println(calculator.total)

    // Starting Object construct

    if (DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }
    println("Database is connected ${DatabaseAccess.connected}")

    val table = Table()
    println(table.color)

    val myGarage = Garage()
    myGarage.car.drive()

    // Starting Inheritance

    val myDog = Corgi()
    myDog.size = 10
    println(myDog.size)
    myDog.bark()
    myDog.play()

    // Continuing Inheritance but, made by me
    val myLaptop = Laptop()
    myLaptop.run()
    val appleLaptop = Apple()
    appleLaptop.screenSize = 25
    appleLaptop.run()

    val myAirplane = Airplane()
    myAirplane.increase(100)
    println("The altitude is ${myAirplane.altitude}")
    myAirplane.descend(20)
    println("The altitude is ${myAirplane.altitude}")
    val myBoeing = Boeing()
    myBoeing.name = "Boeing"
    myBoeing.increase(50)
    println("The altitude is ${myBoeing.altitude}")
    myBoeing.descend(10)
    println("The altitude is ${myBoeing.altitude}")
    val myAirbus = Airbus()
    myAirbus.name = "Airbus"
    myAirbus.increase(70)
    println("The altitude is ${myAirbus.altitude}")
    myAirbus.descend(30)
    println("The altitude is ${myAirbus.altitude}")

    val unemployed = Job()
    unemployed.work(0)
    unemployed.study(5000)
    val iAmAEngineer = Engineer()
    iAmAEngineer.name = "Lucas"
    iAmAEngineer.work(6000)
    iAmAEngineer.study(10000)
    val iAmNotADoctor = Doctor()
    iAmNotADoctor.name = "Jessica"
    iAmNotADoctor.work(4000)
    iAmNotADoctor.study(11000)


}

// Starting Classes
class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}

// Exercise 1

class Animal {
    var name = "Animal"
    var topSpeed = 120

    fun picture() {
        println("$name's max speed is $topSpeed")

    }
}

// Exercise 2
class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun multiplied(a: Int, b: Int) = a * b
    fun divided(a: Int, b: Int) = a / b

}

// Exercise 3
class Jetpack {
    var userHeight = 0

    fun burn(seconds: Int) {
        println("Burning for $seconds seconds")
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        println("Stopping for $seconds seconds")
        userHeight -= 3 * seconds
        if (userHeight < 0)
            userHeight = 0
    }
}

// Exercise 4 made by me
class Calculator {
    var total = 0

    fun adds(a: Int) {
        total += a
    }

    fun subs(a: Int) {
        total -= a
    }

    fun mult(a: Int) {
        total *= a
    }

    fun divide(a: Int) {
        total /= a
    }

    fun reset() {
        total = 0
    }
}

// Starting Object construct

object DatabaseAccess {
    var connected = false
    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from the database")
    }
}

class Table {
    var color: String = "white"
}

class NewCar {
    fun drive() {
        println("Driving along in my car")
    }
}

class Garage {
    val car = NewCar()
}

// Starting Inheritance

open class Dog {
    var size: Int = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Playing")
    }
}

class Corgi : Dog()

// Continuing Inheritance but, made by me
open class Laptop {
    var screenSize = 30
    var speed = 10

    fun run() {
        println("This laptop has screen size $screenSize and speed $speed")
    }
}

class Apple : Laptop()

open class Airplane {
    var altitude = 0
    var name = "Airplane"

    fun increase(speed: Int) {
        println("Increasing $name speed of $speed")
        altitude += speed
    }

    fun descend(speed: Int) {
        println("Decreasing $name speed of $speed")
        altitude -= speed
        if (altitude < 0)
            altitude = 0
    }
}

open class Boeing : Airplane()

class Airbus : Boeing()

open class Job {
    var name = "Unemployed"
    var revenue = 0
    var salary = 0

    fun work(time: Int) {
        salary += time
        revenue += 12 * salary
        println("If $name had worked hard for $time hours it would have a salary like $salary per month, and consequently a revenue per year like $revenue")
    }

    fun study(dedication: Int) {
        salary += dedication
        println("If $name had dedicated more hours like $dedication it probably will have a salary like $salary per month")
    }
}

open class Engineer : Job()

class Doctor : Engineer()

