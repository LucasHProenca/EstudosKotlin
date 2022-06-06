fun main(){
//    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"))
//    count[5] = "five"
//    println(count)
//
//    val countMore = mapOf(Pair(6,"six"), Pair(20,"twenty"))
//    count.putAll(countMore)
//    println(count)
//
//    count.remove(20)
//    println(count)
//
//    count.replace(2,"twotwo")
//    println(count)
//
//    count.clear()
//    print(count)

//    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"))
//    println("This map has a size of ${count.size}")
//    println("Does the map have the key 2? : ${count.containsKey(2)}")
//    println("Does the map have the key 5? : ${count.containsKey(5)}")
//    println("Does the map have the value \"one\"? : ${count.containsValue("one")}")
//    println("Does the map have the value \"five\"? : ${count.containsValue("five")}")
//    println("Is this map empty? : ${count.isEmpty()}")
//    println("Does the map have any key value pairs? : ${count.isNotEmpty()}")

    val count = hashMapOf(Pair(1,"un"), Pair(2,"deux"), Pair(3,"trois"))
    println("The translation of 2 is: ${count.get(2)}")
    println("The translation of 3 is: ${count.get(3)}")
    count[4]= "quatre"
    println(count)

    val customers = mapOf(Pair("John",1), Pair("Alice",5), Pair("Bob",3))
    println("Is \"Alice\" a customer? : ${customers.containsKey("Alice")}. She bought ${customers.get("Alice")} products")
    println("Is \"Michael\" a customer? : ${customers.containsKey("Michael")}")

    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept",3726), Pair("25 Sept", 6253))
    val attendance26 = mapOf(Pair("26 Sept", 4378))
    attendance.putAll(attendance26)
//    val total = 6253 + 4378
    val peopleOn25 = attendance["25 Sept"]?:0
    val peopleOn26 = attendance["26 Sept"]?:0
    println("I have attended in total on 25 Sept and 26 Sept ${peopleOn25 + peopleOn26}")
    println("Is 22 Sept available? ${attendance.containsKey("22 Sept")}")









}