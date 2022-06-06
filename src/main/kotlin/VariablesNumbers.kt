fun main(){
//    val items = 5
//    println(items :: class.java)
//
//    val nbOfPeople = 7500000000
//    println(nbOfPeople :: class.java)
//
//    val price = 29.99
//    println(price :: class.java)
//
//    val pi = 3.144546454698232
//    println(pi :: class.java)
//
//    val dayNumber = 8
//    println(dayNumber)
//    println(dayNumber :: class.java)
//
//    val ellonMuskMoney = 9999000000
//    println(ellonMuskMoney)
//    println(ellonMuskMoney::class.java)
//
//    val timePlayingVideoGames = 24.34
//    println(timePlayingVideoGames)
//    println(timePlayingVideoGames::class.java)

    println("Can you type your favorite number?")
    val favoriteNumber = readLine()?:""
    val integer = favoriteNumber.toInt()
    val var2 = 3.99
    val new = integer * var2
    println("My new number is: $new")
    println("My variable type is ${new::class.java}")

    val testInt = 20
    println(testInt)




}