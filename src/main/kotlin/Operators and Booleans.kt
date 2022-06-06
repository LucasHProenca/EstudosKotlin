fun main (){
    println(5f/2f)

    println(5%2)
    println(7%2)

    var cats = 5
    cats++
    println("Now i have $cats cats")

    cats--
    println("A cat passed away, now i have $cats cats")

    var dogs = 2
    println("I have ${++dogs} dogs")

    val a:Short = 6 // The type of the result of an operation is the same as
    val b = 32 // the type of the largest operand
    val r = a * b // in therms of size of memory
    println(r.javaClass) // Byte < Short < Int < Long < Float < Double

    val c:Long = 849496
    val d = 12.44F
    val re = c/d
    println(re)
    println(re.javaClass)

    val e = 19F
    val f = 84.36462
    val res = e * f
    println(res)
    println(res.javaClass)

    val dozen = 12
    val months = dozen
    println(months)

    val userName ="Julia"
    val greeting ="Hello, $userName"
    println(greeting)

    val products = 3
    val price = 9.99
    println("Your total is ${products * price}")

    var bikes = 5
    bikes += 1
    println(bikes)
    bikes -= 2
    println(bikes)
    bikes *= 2
    println(bikes)
    bikes /= 2
    println(bikes)
    bikes = 5
    bikes %=2
    println(bikes)

    var aa = 76.254
    var bb = 3.867
    println("Addition is ${aa + bb}")
    println("Subtraction is ${aa - bb}")
    println("Multiplication is ${aa * bb}")
    println("Division is ${aa / bb}")
    println("Remainder is ${aa % bb} ")

    val meatPrice = 29.99
    val meatAmount = meatPrice * 1f/3f
    println("The person will spend $meatAmount")

//    println("How much do you've in your bank account?")
//    val bankAmount = readLine()?:""
//    val amount = bankAmount.toDouble()
//    println("You've now in your bank account ${amount * 3}")

//    println("How much do you've in your bank account?")
//    val bankAmount = readLine()?:""
//    val amount = bankAmount.toDouble()
//    val after5Years = amount * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
//    println("After 5 years, with an interest of 5.5% per year, you'll have $after5Years")

    val isDay = true
    val isNight = false
    println(isDay && isNight) // And
    println(isDay || isNight) // Or
    println(!isNight) // Not

    val a1 = 5
    val a2 = 7
    println("$a1>$a2 will return ${a1>a2}")
    println(a1<a2)
    println(a1>=a2)
    println(a1<=a2)
    println(a1==a2)
    println(a1!=a2) // not equal
    val result2 = a1!=a2
    println(result2)

    val expression1 = 5.374 * 9.5847
    val expression2 = 3.237 * 15.3726
    println("Is $expression1 > $expression2 : ${expression1>expression2}")

    val exp3 = ((true && false) || (true || false))
    println(exp3)

    val exp4 = !((3>=3) && (false || (2 < 5))) // the opposite for true && true it's false
    println(exp4)

    val toys = 2
    val toysBroken = 1
    val exp5 = (toys < 5) && (toys >= toysBroken)
    println(5 > toys)
    println(toys > toysBroken)
    println("Will the child get a new toy? ${exp5}")

    val cows = 3
    val milkCows = 1
    val children = 2
    val familyMembers = 2 + children
    val exp6 = ((cows <= 5) && (milkCows > 0)) || (familyMembers >=3)
    println("Will the farmer receive the funding? ${exp6}")












}