fun main(){
//    val numbers = hashSetOf(3,5,7,9,null,3)
//    val noNumbers = hashSetOf<Int>()
//    println(numbers)
//    println(noNumbers)
//
//    numbers.add(44)
//    println(numbers)
//
//    val newNumbers = setOf(4,8,9,10,7)
//    numbers.addAll(newNumbers)
//    println(numbers)
//
//    numbers.remove(9)
//    println(numbers)
//
//    numbers.removeAll(newNumbers)
//    println(numbers)

//    val colors = hashSetOf<String>()
//    val newColors = listOf("Green", "blue", "Yellow")
//    colors.addAll(newColors)
//    println(colors)
//    colors.remove("blue")
//    println(colors)
//
//    val desk = hashSetOf("book","mouse","notebook","pencil","eraser","pen","earphones")
//    val deskRemove = setOf("earphones","book")
//    desk.removeAll(deskRemove)
//    println(desk)
//
//    val customers = hashSetOf("maiara","luiz","marli")
//    val newCustomer = setOf("juninho")
//    customers.addAll(newCustomer)
//    println(customers)
//    customers.remove("luiz")
//    println(customers)

//    val numbers = setOf(3,4,5,7,null,9)
//    println(numbers.size)
//
//    println(numbers.contains(3))
//    println(numbers.contains(6))
//
//    val newNumbers = setOf(3,5,7)
//    println(numbers.containsAll(newNumbers))
//
//    println(numbers.isEmpty())

//    val numbers = hashSetOf(3,5,7,8,9)
//    val newNumbers = setOf(3,7,9)
//    numbers.retainAll(newNumbers)
//    println(numbers)
//
//    numbers.clear()
//    println(numbers)
//    println(numbers.isEmpty())

//    val numbers = setOf(3,5,7,9,11,13,19,21,28,30)
//    println(numbers.contains(22))
//    println(numbers.contains(11))

    val myDrinks = hashSetOf("water","natural juice","sweet drinks","smirnoff")
    val myGirlFriendDrinks = hashSetOf("water","soda","natural juice")
    myDrinks.retainAll(myGirlFriendDrinks)
    println(myDrinks)

    val acceptedColors = hashSetOf("white","black","gray")
    val myColors = hashSetOf("red","pink","white","blue","black","green")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)





}