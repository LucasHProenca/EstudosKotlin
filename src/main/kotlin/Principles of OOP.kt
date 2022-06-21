fun main() {
    // inheritance
    val carol = Daughter("french")
    println(carol.hairColor)
    carol.say("Hi")

    val parakeet = Parakeet()
    parakeet.flyMethod()

    val names = Son()
    names.printName()

    // Scope/ Encapsulation

    val myLock = EncriptionLock(40)

    println("Does the key 30 unlock my lock: ${myLock.unlock(30)}")
    println("Does the key 40 unlock my lock: ${myLock.unlock(40)}")
    println("Does the key 70 unlock my lock: ${myLock.unlock(70)}")
    println("Does the key 50 unlock my lock: ${myLock.unlock(50)}")
    println("Does the key 60 unlock my lock: ${myLock.unlock(60)}")

    val myRestaurant = Franchise()
    myRestaurant.prepareBurguers()

    // abstraction

    val myContainer = Bottle()
    myContainer.pour()
    val myContainer2 = Jug()
    myContainer2.pour()

    val myPug = Pug("pug")
    myPug.play()
    myPug.run()
    myPug.bark()

    val myBassetHound = BassetHound("bassethound")
    myBassetHound.bark()
    myBassetHound.play()
    myBassetHound.run()

    val myChihuahua = Chihuahua("chihuahua")
    myChihuahua.bark()
    myChihuahua.run()
    myChihuahua.play()

    val myBosch = Bosch("Bosch")
    myBosch.cooking()

    val myRoaster = Roaster("Roaster")
    myRoaster.cooking()

    // Polymorphism

    val myMom = MyMom()
    val myDaughter = MyDaughter()

    myMom.say("hi")
    myDaughter.say("hi")

    val myMom2 = Mom2()
    myMom2.say()
    myMom2.say("hello")
    myMom2.say("hello there", 4)

    val myLanguage = Translator()
    myLanguage.languages()
    myLanguage.languages("fr")
    myLanguage.languages("pt")
    myLanguage.languages("ch")

    val myTV = Tv()
    myTV.tV("Action")
    myTV.tV("Action",200,4)
    myTV.tV("Action",200,4,24)
}

// inheritance

open class Mom(nativeTongue: String) {
    open val hairColor = "Brown"
    val eyeColor = "Blue"

    open fun say(message:String) {
        println("mom says $message")
    }
}
class Daughter(nativeTongue: String): Mom(nativeTongue) {
    override val hairColor = "Blonde"
    override fun say(message: String) {
        println("daughter says $message")
        super.say(message)
        println("Mother has ${super.hairColor} hair color")
    }
}

open class Bird {
    open val color = "blue"
    open val speed = 100

    open fun flyMethod() {
        println("This bird color is $color and is flying by speed of $speed")
    }
}

class Parakeet: Bird() {
    override val color = "black"
    override val speed = 50
    override fun flyMethod() {
        super.flyMethod()
        println("A ${super.color} bird can fly up to ${super.speed} kph")
    }
}

open class Father () {
    open val firstName = "Luiz"
    val lastName = "Proença"

    open fun printName() {
        println("My name first name is $firstName and my surname is $lastName ")
    }
}

class Son: Father() {
    override val firstName = "Lucas"
    override fun printName() {
        super.printName()
        println("My father's is ${super.firstName} and his surname is $lastName")
    }
}
// Scope/ Encapsulation

// private - no one are able to access
// protected - only classes which refers an open class are able to access
// internal - if it's in the same package are able to access
// public - it's public lol
open class Airplane2 {
    var type = "Airbus"

    fun fly() {
        println("flying")
    }
}

class MyAirplane:Airplane2() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar() {
    fun start() {
        val airplane = Airplane2()
        println(airplane.type)
        airplane.fly()
    }
}

class EncriptionLock(private val privateKey: Int) {

    fun unlock(publicKey: Int) = formula(publicKey) == privateKey

    private fun formula(publicKey: Int) = publicKey / 2 + 5
}

open class FamousFastFood() {
    protected fun secretFormula() = "The secret formula is..."

}

class Franchise: FamousFastFood() {
    fun prepareBurguers() {
        println("Preparing burgers according to the secret formula")
        println(secretFormula())
    }

}

// Abstraction


abstract class Container {
    fun pour() {
        println("pouring liquid")
    }
}

class Bottle: Container() {

}

class Jug: Container() {

}

abstract class Dog2(name:String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name:String): Dog2(name) {
    override fun run() {
        println("$name is running")
    }

    override fun bark() {
        println("$name Can't bark")
    }

    override fun play() {
        println("$name is playing")
    }

}

class BassetHound(val name:String): Dog2(name) {
    override fun run() {
        println("$name can't run")
    }

    override fun bark() {
        println("$name is Barking")
    }

    override fun play() {
        println("$name is playing")
    }

}
class Chihuahua(val name:String): Dog2(name) {
    override fun run() {
        println("$name is running")
    }

    override fun bark() {
        println("$name is barking")
    }

    override fun play() {
        println("$name can't play")
    }

}

abstract class Oven(model:String) {
    val cookingSpeed = 120
    open val averageTemperature = 180
    abstract fun cooking()
}

class Bosch(val model:String): Oven(model) {
    override val averageTemperature = 210
    override fun cooking() {
        println("$model has a function for cooking and can cook in $cookingSpeed seconds and $averageTemperature temperature")
    }

}

class Roaster(val model:String): Oven(model) {

    override fun cooking() {
        println("$model CANNOT cook but roasts and the roasts speed is $cookingSpeed seconds and the temperature is $averageTemperature")
    }

}

open class MyMom {
    open fun say(message: String) {
        println("Mom says $message")
    }
}

class MyDaughter: MyMom() {
    override fun say(message: String) {
        println("Daughter says $message")
    }
}

class Mom2() {
    fun say(message: String) {
        println("mom says $message")
    }

    fun say() {
        println("mom says hi")
    }

    fun say(message: String, times:Int) {
        for(i in 1..times) {
            println(message)
        }
    }
}

class Translator() {
    fun languages() {
        println("English is an amazing language")
    }

    fun languages(name:String) {
        when(name) {
            "fr" -> println("i'm able to talk in french")
            "pt" -> println("i can talk in portuguese")
            else -> println("English is an amazing language")
        }
    }
}

class Tv() {
    fun tV(programs:String) {
        println("Have $programs programs")
    }

    fun tV(programs: String, channel:Int, subtitle:Int) {
        println("Have $programs programs, $channel channels and $subtitle subtitles")
    }

    fun tV(programs: String, channel: Int, subtitle: Int, time:Int) {
        println("Have $programs programs, $channel channels and $subtitle subtitles and can record for $time hours ")
    }
}