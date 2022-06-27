fun main() {

    val myUser = User("John", "John@gmail.com", "John is cool")
    println(myUser)
    val user2 = User("John", "John@gmail.com", "John is cool")
    println(myUser == user2)
    val user5 = user2.copy(email = "lucasproenca@gmail.com")
    println(user5)

    val user3 = RegularUser("John", "John@gmail.com", "John is cool")
    val user4 = RegularUser("John", "John@gmail.com", "John is cool")
    println(user3 == user4)

    val customers = arrayListOf<CustomerInformations>()
    customers.add(CustomerInformations("Alice", "alice@gmail.com", 7))
    customers.add(CustomerInformations("Bob", "bob@gmail.com", 10))
    customers.add(CustomerInformations("Carol", "carol@gmail.com", 12))
    println(customers)

    val newCustomer = customers[1].copy(email = "bobsnewemail@gmail.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)

    val article1 = NetworkServer("League of Legends", "Champions", 10)
    val article2 = NetworkServer("World of Warcraft", "Classes", 8)
    println(article1)
    println(article2)

    val updateArticle1 = article1.copy(title = "LOL")
    println(updateArticle1)
}

data class User(
    val name: String, val email: String, val password: String
)

class RegularUser(
    val name: String, val email: String, val password: String
)

data class CustomerInformations(
    val name: String, val email: String, val productsBought: Int
)

fun sendEmail(customers: ArrayList<CustomerInformations>) {
    customers.forEach { println("Sending an email to ${it.email}") }
}

data class NetworkServer(
    val title: String, val content: String, val numberOfReaders: Int
)