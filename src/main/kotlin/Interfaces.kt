fun main() {
    val myOven: Oven2 = getOven()
    myOven.turnOn()
    myOven.cook(150)
    myOven.turnOff()

    val rest1: Restaurant = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = FancyRestaurant()
    rest2.provideBill()
    rest2.provideFood()

    val factory = CarFactory()
    val myCar: HisCar = factory.provideCar()

    myCar.speed = 90
    myCar.drive()
    myCar.park()

    val coffeeShop = CoffeeShop()
    var myCoffee: Coffee? = null

    for (i in 1..5) {
        myCoffee = coffeeShop.purchaseCoffee()
        myCoffee.quenchThirst()
        myCoffee.wakeUp()

        val child = Child()
        child.raisePet()
    }
}

interface Oven2 {
    val temperature: Int
    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

class Bosch2 : Oven2 {
    override val temperature = 180

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }

}

fun getOven(): Oven2 {
    return Bosch2()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("Your local restaurant provides food and drinks")
    }

    override fun provideBill() {
        println("Please pay 25 dollars")
    }
}

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("This is the most delicious i have ever tried")
    }

    override fun provideBill() {
        println("Please pay 100 dollars")
    }
}

interface HisCar {
    fun drive()
    fun park()
    var speed: Int
}

class BMW : HisCar {
    override var speed = 180

    override fun drive() {
        println("Driving BMW at $speed")
    }

    override fun park() {
        println("Parking BMW")
    }
}

class CarFactory {
    fun provideCar(): HisCar {
        return BMW()
    }

}

interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}

class Arabica : Coffee {
    override fun wakeUp() {
        println("Waking up by Arabica")
    }

    override fun quenchThirst() {
        println("Quenching thirst by Arabica")
    }
}

class Robusta : Coffee {
    override fun wakeUp() {
        println("Waking up by Robusta")
    }

    override fun quenchThirst() {
        println("Quenching thirst by Robusta")
    }
}

class CoffeeShop {
    fun purchaseCoffee(): Coffee {
        val randomNumber: Long = System.currentTimeMillis()
        if (randomNumber % 2 == 0L) return Arabica()
        else return Robusta()

    }
}

interface Pet {
    var cutenessLevel: Int
    fun startPlaying()
    fun feed()
}

class Puppy : Pet {
    override var cutenessLevel: Int = 10

    override fun startPlaying() {
        println("Dogs play by running jumping and barking")
    }

    override fun feed() {
        println("Give doggy treats")
    }
}

class Child {
    val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for (i in 1..pet.cutenessLevel) {
            pet.startPlaying()
        }
        pet.feed()
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}