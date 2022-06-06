fun main (){
//    val colors = listOf("blue", "red", "yellow")
//    println(colors)
//    val colors2 = listOf<String>()
//    println(colors2)
//    val colors3 = listOf("blue","red","blue","yellow","blue")
//    println(colors3)
//    val colors4 = listOf("blue","red","blue",null,null)
//    println(colors4)
//
//    println(colors[0])
//    println(colors.get(1))
//    println(colors.size)

//    val colors = arrayListOf("blue","red")
//    println(colors)
//    val noColors = arrayListOf<String>()
//    println(noColors)
//    colors.add("yellow")
//    println(colors)
//    val moreColors = arrayListOf("pink","teal")
//    colors.addAll(moreColors)
//    println(colors)
//
//    colors.remove("red")
//    println(colors)
//
//    colors.removeAll(moreColors)
//    println(colors)
//
//    colors.add("red")
//    colors.add("blue")
//    println(colors)
//    colors.removeAt(1)
//    println(colors)
//    colors.remove("blue")
//    println(colors)

//    val customers = arrayListOf("Maiara","Marli","Luiz","Juninho","Suzana")
//    println(customers)
//    customers.add("Thiago")
//    println(customers)
//    customers.remove("Suzana")
//    println(customers)
//
//    val animals = listOf("cat","bird","dog")
//    println(animals.size)
//    println(animals[1])
//    println(animals.get(1))

    val items = arrayListOf("laptop","mouse","pen","paper","mug","phone")
    val removedItems = listOf("pen","paper","mug","phone")
    items.removeAll(removedItems)
    println(items)

//    val colors = listOf("blue","red","blue","orange","green")
//    println(colors.size)
//    println(colors.contains("red"))
//    println(colors.contains("pink"))
//
//    val newColors = listOf("red","green","teal")
//    println(colors.containsAll(newColors))
//
//    println(colors.indexOf("red"))
//    println(colors.lastIndexOf("blue"))

    val colors = arrayListOf("blue","red","blue","green")
    colors.set(1,"redder") // blue, redder, red, blue, green
    println(colors)
    val subColors = colors.subList(1, 3 )
    println(subColors)
    println(subColors.javaClass)

    colors.clear()
    println(colors)
    println(colors.isEmpty())

    val winners = listOf("Usain","John","Michael","Alex","Bob")
    println("Michael finished on position ${winners.indexOf("Michael") + 1}")

    val ingredients = arrayListOf("chicken","egg","mozzarella","pepper")
//    ingredients.remove("mozzarella")
//    ingredients.add("blue cheese")
    ingredients.set(ingredients.indexOf("mozzarella"), "blue cheese")
    println(ingredients)

    val requiredColors = listOf("red","blue")
    val availableColors = listOf("red","blue","green")
    println(availableColors.containsAll(requiredColors))

    val animals = arrayListOf("lion","zebra","chimp","elephant") // SOLUÇÃO A
    animals.set(animals.indexOf("lion"), "panda bear cub")
    println(animals)
    val checkListAnimals = listOf("elephants","giraffes")
    println(animals.containsAll(checkListAnimals))

    val animals2 = arrayListOf("lion","zebra","chimp","elephant") // SOLUÇÃO B
    animals2.add("panda bear cub")
    println(animals2)
    animals2.remove("lion")
    println(animals2)
    println(animals2.containsAll(checkListAnimals))
    







}