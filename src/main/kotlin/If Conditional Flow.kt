fun main(){
//    println("Please input the funds amount")
//    val input = readLine()?:""
//    var clientFunds = input.toInt()
//    val price = 50
//    var clientProducts = 0
//
//    if(clientFunds > price) {
//        clientFunds -= price
//        clientProducts += 1
//        println("You have purchased $clientProducts products")
//        println("You have $clientFunds funds")
//    } else{
//        println("You've insufficient funds to purchase the products")
//    }

//    println("Please check if have cat food")
//    val check = readLine()?:""
//    val hasCatFood = check.toBoolean()
//    val petStore = listOf("cat","dog","rabbit")
//
//    if(petStore.contains("cat")) {
//        if (hasCatFood) {
//            println("Buy cat and cat food")
//        } else {
//            println("Buy cat") // if the second is false
//        }
//    }else{
//            println("Ask pet store to get cat") // if the first is false
//        }

//    println("Do you have the keys? (yes/no)")
//    val keys = readLine()?:""
//    var haveKeys = false
//
//    if(keys == "yes"){
//        haveKeys = true
//    }
//
//    if(haveKeys){
//        println("You can turn on the car")
//    } else{
//        println("You need to find the keys")
//    }

//    println("Input the current time")
//    val input = readLine()?:""
//    val hour = input.toInt()
//
//    if(hour <= 12) {
//        println("$hour am")
//    } else{
//        println("${hour - 12} pm")
//    }

//    val hasEggs = true
//    val hasBacon = false
//    val eggsPrice = 5
//    val baconPrice = 20
//
//    if(hasEggs){
//        if(hasBacon){
//            println("You'll spend ${(baconPrice * 2) + (eggsPrice * 12)} dollars")
//        } else{
//        println("You'll spend ${eggsPrice * 12} dollars")
//    }
//        } else{
//            println("You don't find anything")
//    }

//    println("Please input your favorite animal")
//    val input = readLine()?:""
//    val animal = input.toString()
//
//    val action = if(animal == "dog"){
//        "Pet it"
//    } else if(animal == "cat"){
//        "Feed it"
//    } else if(animal == "crocodile"){
//        "run away"
//    } else{
//        "google it"
//    }
//    println("If you encounter a $animal you should $action")

//    var response = 304
//
//    val message = if(response/100 == 1){
//        "Information response"
//} else if(response/100 == 2){
//    "Success"
//    } else if(response/100 == 3){
//        "Redirect"
//    } else if(response/100 == 4){
//        "Client error"
//    } else{
//        "Server else"
//    }
//    println(message)

    println("Insert how many points which you make (0 - 100)")
    val input = readLine()?:""
    val examPoints = input.toInt()

    val grade = if(examPoints >= 90 ){
        "A"
    }else if(examPoints >= 80){
        "B"
    } else if(examPoints >= 70){
        "C"
    } else if(examPoints >= 60){
        "D"
    } else if(examPoints >= 50){
        "E"
    } else{
        "F"
    }
    println("You get $grade")

}