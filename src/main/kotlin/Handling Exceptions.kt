import java.lang.Exception

fun main(){
//    println("Please enter a number")
//    val test = readLine()
//    try{
//        println(test?.toInt()?.times(5)) // If you insert a number (because it's int), it's ok
//    } catch (e: Exception) { // However, if you insert another thing, it's going to be an Exception, and then
//        println("An exception happened \n ${e.localizedMessage}") // give me this message, and find for me.
//        e.printStackTrace() // If you wanna see where is the error, type me.
//    } finally {
//        println("The execution has completed")
//    }

//    println("Input how many kilometers you ran today")
//    val ran = readLine()
//    try{
//        println(ran?.toInt()?.times(0.62))
//    } catch (e: Exception) {
//        println("Please give me a number instead of a text \n ${e.localizedMessage}")
//    }

    val product = 9.99
    println("What product do you wanna buy?")
    val customer = readLine()
    println("how many would you like?")
    val items2 = readLine()
    try{
        val items = items2?.toInt()
        println("You'll spend at least ${items?.times(product)} if you wanna buy this amount")
    } catch (e: Exception) {
        println("this is not used to cook strogonoff \n ${e.localizedMessage}")
    }

}