fun main() {

    superMarketStore()


}

data class Products(
    val name: String, val store: Int, val price: Double
)


fun superMarketStore() {
    val wishList = arrayListOf("")
    val products = arrayListOf<Products>()
    products.add(Products("Carrot", 10, 4.99))
    products.add(Products("Apple", 15, 3.99))
    products.add(Products("Pineapple", 20, 7.99))
    println("Please enter the word List to see the store")
    val input = readLine() ?: ""
    if (input == "List") {
        println(products)
    } else {
        wishList.add(input)
        println(wishList)
    }
}

