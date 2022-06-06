fun main() {
//    val onlyEvenNumbers = arrayListOf(2,4,6,8,7,10)
//    for(number in onlyEvenNumbers) {
//        if(number % 2 != 0) break
//        println("Half of $number is ${number/2}")
//    }

    val onlyEvenNumbers = arrayListOf(2,4,6,8,7,10)
    for(number in onlyEvenNumbers) {
        if(number % 2 != 0) continue
        println("Half of $number is ${number/2}")
    }

    val clients = arrayListOf("Anna", "Bob", "Carol", "David")
    for(client in clients) {
        if(client[0] == 'C')
            continue
        println("Hello $client")
    }

//    val animals = arrayListOf<String>()
//    for (i in 1..5) {
//        println("Please enter an animal")
//        val input = readLine()?:""
//        if (input == "snake") {
//            println("Sorry we cannot accept snakes")
//            break
//        }
//        animals.add(input)
//        println("Current animals $animals")
//    }

    while(true) {
        println("Please input your age")
        val input = readLine()?:""
        if (input == "stop")
            break

        val age = input.toInt()
        if(age < 17) {
            println("You can't go")
            continue
    } else {
        println("You're welcome")
        }
    }
}