//private operator fun <E> ArrayList<E>.invoke(value: Any) {
//
//}

fun main() {

    val clients: List<String> = listOf("Anna", "Bob", "Carol", "Dan")
//    clients.forEach { println("Hello $it") }
//    clients.filter { it.length < 5 }
//        .forEach { println("Hello $it") }
//    val sizes = clients.map { it.length }
//    println(sizes)
//    val sorted = clients.sortedBy { it.length }
//    println(sorted)
//    val max = clients.maxByOrNull { it.length }
//    println(max)
//    val min = clients.minByOrNull { it.length }
//    println(min)
    println(clients.sortedBy { it[it.length-1] })

//    val numbers: Set<Int> = setOf(3,456,567,89,10,8,12)
//    println(numbers.filter { it in 10..99 })

    val ints: List<Int> = listOf(372,194,256,347)
    println(ints.maxByOrNull { it.toString()[1].toInt() })
    println(ints.maxByOrNull { it / 10 % 10 })

    val numbers: List<Int> = listOf(34,67,50,89,456,351,8,64,9,10)
    val subset: List<Int> = numbers.map {
    if(it % 2 == 0)
        it / 2
        else
            it * 2
    }
        .filter { it > 25 }
    println(subset)

//    sayHello(arrayListOf("Alice","Bob","Carol","David"))
//    {name: String -> println("Hello there $name") }
//
//    val numbers: ArrayList<Int> = arrayListOf(3,8,6,5,435,56,34,768,45)
//    println(numbers)
//    val newNumbers: ArrayList<Int> = update(numbers) {number -> number / 10}
//    println(newNumbers)

//    val customers: ArrayList<String> = arrayListOf("Lucas", "Luis", "Marli")
//    println(customers)
//    val names: ArrayList<String> = clientName(customers) {client -> "Hello $client"}
//    println(names)

//    val result: String = callMyHOF(arrayListOf("Lucas", "Luis")) { name -> "Hello $name"}
//    println(result)

}

//fun callMyHOF(names: ArrayList<String>, myHOF: (String) -> String): String {
//    return myHOF(names.toString())
//}
//fun clientName(customers: ArrayList<String>, doAnything: (String) -> String): ArrayList<String> {
//    for (client:String in customers) {
//        doAnything(client)
//    }
//    return customers
//}

//fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
//    for (name:String in names) {
//        doSomething(name)
//    }
//}
//
//fun update(numbers: ArrayList<Int>, lbd:(Int) -> Int): ArrayList<Int> {
//    for(i:Int in 0..numbers.size-1) {
//        if (numbers[i] %2 == 0)
//            numbers[i] = lbd(numbers[i])
//    }
//    return numbers
//}

