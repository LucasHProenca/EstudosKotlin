fun main() {

    val myBox = Box<String>()
    myBox.display("Content")

    val carBox = Box<Car14>()
    carBox.display(Car14())

    val newBox = NewBox<Int, Float>()
    newBox.display(3, 5.7F)

    val myXbox = Xbox<String>()
    myXbox.games("pes")

    val myPs4 = Ps4<String>()
    myPs4.convert("God of war")

    val yourPs4 = Ps4<Int>()
    yourPs4.convert(354)

    val ps4DoThiago = Ps4<Double>()
    ps4DoThiago.convert(5.648)

    val chef1 = Chef1<Apple1>()
    chef1.cook(Apple1())

    val chef2 = Chef1<Banana1>()
    chef2.cook(Banana1())

    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Alice", "Bob", "Carol"))

    val printer2 = Printer<List<String>>()
    printer2.iterate(arrayListOf("Lucas", "Maiara", "Marli"))

    val circleArea = Geometry<Circle>()
    circleArea.getArea(Circle())

    val squareArea = Geometry<Square>()
    squareArea.getArea(Square())

}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class Car14

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

class Xbox<T> {
    fun games(game: T) {
        println(game.toString().length)
    }
}

class Ps4<T> {
    fun convert(text: T) {
        println(text.toString())
        println("Some message $text")
    }
}

abstract class Fruit1 {
    abstract fun peel()
}

class Apple1 : Fruit1() {
    override fun peel() {
        println("Peeling the apple")
    }
}

class Banana1 : Fruit1() {
    override fun peel() {
        println("Peeling the banana")
    }
}

class Chef1<T : Fruit1> {
    fun cook(item: T) {
        item.peel()
    }
}

class Printer<T : Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach { println(it.toString()) }
    }
}

abstract class Shape {
    abstract fun getArea(size: Int)
}

class Square : Shape() {
    override fun getArea(size: Int) {
        println("The Square with size $size has an area is = ${size * size}")
    }
}

class Circle : Shape() {
    override fun getArea(size: Int) {
        println("The Circle with size $size has an area is = ${size * 3.14}")
    }
}

class Geometry<T : Shape> {
    fun getArea(area: T) {
        area.getArea(10)
    }
}