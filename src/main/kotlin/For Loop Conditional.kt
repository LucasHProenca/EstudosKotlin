fun main() {
    val animals = arrayListOf("cat", "dog", "bear")
    for (animal in animals) {
        println("Feed the $animal")
    }

    for (i in 1..12) {
        val month = when (i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            else -> "December"
        }
        println("Month #$i is a $month")
    }

    for(ui in 1..10) {
        println("#$ui Hello, how are you?")
    }
    var total = 0
    for(ko in 1..100) {
        total += ko
    }
    println("Total is $total")

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    for(customerName in customers.keys) {
        val purchases = customers[customerName]
        println("$customerName you purchased $purchases items")
    }

//    println("Please enter a year")
//    val input = readLine()?:"2020"
//    val year = input.toInt()
//
//    for(i in 1..12) {
//        val message = when (i) {
//            1 -> "January has 31 days"
//            2 -> if (year % 4 == 0) "February has 29 days" else "February has 28 days"
//            3 -> "March has 31 days"
//            4 -> "April has 30 days"
//            5 -> "May has 31 days"
//            6 -> "June has 30 days"
//            7 -> "July has 31 days"
//            8 -> "August has 31 days"
//            9 -> "September has 30 days"
//            10 -> "October has 31 days"
//            11 -> "November has 30 days"
//            12 -> "December has 31 days"
//            else -> ""
//        }
//        println(message)
//    }

    for(i in 10 downTo 0) {
        println(i)
        when(i) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("Go!")
        }
    }

    for(kiu in 10 downTo 0 step 3) {
        println(kiu)
    }

    for(i in 1..3) {
        println("Strike #$i")
    }
    println("You're out!")

//    val matrixSize = 9
//    for(i in 0..matrixSize) {
//        for(j in 0..matrixSize) {
//            if(i==j) {
//                print("diagonal\t")
//            } else {
//                print("$i,$j  \t\t")
//            }
//        }
//        println()
//    }
//    println("Please enter a number")
//    val input = readLine()?:"0"
//    val maxValue = input.toInt()
//    for(i in maxValue downTo 0) {
//        if (i % 7 == 0) {
//            println(i)
//
//        }
//    }
//    for(i in 1..10) {
//        for(j in 1..i) {
//            print("\uD83D\uDE00")
//        }
//        println()
//    }

    println("Please enter a  number")
    val input = readLine()?:""
    val matrixSize = input.toInt()
    for (i in 0..matrixSize) {
        if(i % 3 == 0) {
            print("\uD83D\uDE00")
        } else if(i % 3 == 1) {
            print("\uD83E\uDD28")
        } else if(i % 3 == 2) {
            print("\uD83D\uDE31")
        } else {
            print("")
        }
        println()
    }

}