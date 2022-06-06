fun main() {
//    val puzzlePieces = 20
//    var piecesPlaced = 0
//    while(piecesPlaced < puzzlePieces) {
//        piecesPlaced++
//        println("Placed piece #$piecesPlaced")
//    }
//
//   var i = 0
//    while(i < 10) {
//        i++
//        println("#$i you are welcome!")
//    }
//
//    val cats = listOf("Tiger", "Smokey", "Sassy", "Patch")
//    var index = 0
//    while(index < cats.size) {
//        println("Hello ${cats[index]}")
//        index++
//    }

//    println("Please enter a number")
//    val input = readLine()?:""
//    val number = input.toInt()
//    var j = 1
//    var result = 1L
//    while (j <= number) {
//        result *= j
//        j++
//    }
//    println("$number! = $result")

//    println("Please enter a number")
//    val input = readLine()?:"0"
//    val maxValue = input.toInt()
//    var i = 0
//    while(i < maxValue) {
//        if (i % 7 == 0)
//        println(i)
//        i++
//    }

//    val puzzlePieces = 20
//    var piecesPlaced = 0
//    do {
//        piecesPlaced++
//        println("Placed piece #$piecesPlaced")
//    } while (piecesPlaced < puzzlePieces)
//
//    var i = 0
//    var j = 0
//    while (i <= 10) {
//        while (j <= 10) {
//            print("$i, $j\t")
//            j++
//        }
//        i++
//        j = 0
//        println()
//    }

//    var finished = false
//    do {
//        println("Please enter a number greater than 100")
//        val input = readLine() ?: ""
//        val number = input.toInt()
//        if (number > 100) {
//            println("Thanks")
//            finished = true
//        } else {
//            println("$number is not greater than 100. Please try again")
//        }
//    } while (!finished)

//    var finished = false
//    do {
//        println("Please enter a number")
//        val input = readLine() ?: ""
//        val number = input.toInt()
//        var factorial = 1
//        var i = 1
//        while(i <= number) {
//            factorial *= i
//            i++
//        }
//        if (factorial < 3000000) {
//            println("$number! = $factorial is smaller than 3000000. Please try again")
//        } else {
//            println("$number! = $factorial")
//            finished = true
//        }
//    } while (!finished)

    var finished = false
    do {
        println("Please enter a name")
        val input = readLine() ?: ""
        val name = hashSetOf("John", "Bob", "Alice")
        if (input in name) {
            println("Please try again")
        } else {
            name.add(input)
            finished = true
            println(name)
        }
    } while (!finished)
}