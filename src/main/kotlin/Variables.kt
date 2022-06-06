const val URL_LINK = "google.com"

fun main() {
    var games = "Many"
    println(games)
    games = "Too Many"
    println(games)

//    var age = "24"
//    age = "many" //"You can't change the type of the variable"

    var color = "Blue"
    color = "Red"
    println(color)

//    Val color = "Blue"

//    color = "Red" "Val it's a immutable variable"

//    var camelCase = "Camel" // If you need more then one word to describe your variable, start with a lower case,and then every word that comes after, start with a Capital letter

    val myPet = "Crocodile"
    println(myPet.length)

    val myName = "lucas"
    println(myName.capitalize())

    val zooAnimal = "Giraffe"
    println(zooAnimal.decapitalize())

    val myText = "  There are  too many  spaces   "
    println(myText.trim())

    val myUncle = "Sergio"
    println(myUncle.get(3))

    val myGirlfriend = "Void"
    println(myGirlfriend[2])

    val myFavoriteGame = "World of Warcraft"
    println(myFavoriteGame.substring(6))
    println(myFavoriteGame.substring(6,9))
    println("The best ${myFavoriteGame} expansion were Wrath of the Lich King")
    println("I've ${1+1} cats")

    val myCatsName = "My cat's name is \"Fluffy\""
    println("myCatsName variable length is ${myCatsName.length}")

    val myCar = "My car won't start"
    println(myCar.substring(3,6))

    val customer = "John"
    println("You're always welcome here $customer")

    val apples = 3
    val oranges = 6
    println("There are ${apples} apples and ${oranges} oranges")
    println("The total number of fruit is ${apples + oranges}")

    val client = "Mary"
    val products = 3
    val price = 30
    println("How much are these ${products} T-shirts? You'll spend ${products.times(price)}, $client")

    println("Acessing URL $URL_LINK")

}