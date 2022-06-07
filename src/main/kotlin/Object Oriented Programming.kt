fun main () {
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
    println("3 + 5 = ${myMath.add(3,5)}")
    println("3 - 2 = ${myMath.sub(3,2)}")
    println("6 / 2 = ${myMath.divided(6,2)}")
    println("3 * 5 = ${myMath.multiplied(3,5)}")

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

}
    // Starting Classes
    class Car {
        var model:String? = null
        var topSpeed = 100

        fun start() {
            println("Starting the $model")
        }

        fun drive(speed:Int) {
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
    fun add(a:Int, b:Int) = a + b
    fun sub(a:Int, b:Int) = a - b
    fun multiplied(a:Int, b:Int) = a * b
    fun divided(a:Int, b:Int) = a / b

}

// Exercise 3
class Jetpack {
    var userHeight = 0

    fun burn(seconds:Int) {
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

    fun adds(a:Int) {
        total += a
    }
    fun subs(a:Int) {
        total -= a
    }
    fun mult(a:Int) {
        total *= a
    }
    fun divide(a:Int) {
        total /= a
    }
    fun reset() {
        total = 0
    }
}
