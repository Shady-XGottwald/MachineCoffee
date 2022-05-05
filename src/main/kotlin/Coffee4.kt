const val espresso = "1"
const val latte = "2"
const val cappuchino = "3"
var water = 400
var milk = 540
var beans = 120
var cups = 9
var money =  550

private fun main (){
    start()
    action()
    start()

}

private fun start (){
    println("The coffee machine has:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")
    println("$cups disposable cups")
    println("$$money of money")

    return
}
private fun action() {
        // Prompt for innit action
    println("Write action (buy, fill, take):")
    val act = readLine()!!.toString()

       //Choose Coffee


    //Check Conditions


    when (act ){
        "buy" -> {
            println("What do you want to buy?  1 - espresso, 2 - latte, 3 - cappuccino:")
            val input = readLine()!!.toString()
             if(input == espresso) {
                    water -= 250
                    beans -= 16
                    money += 4
                    cups -= 1
             }
            else if (input == latte){
                 water -= 350
                 milk -= 75
                 beans -= 20
                 money += 7
                 cups -= 1
            }
            else if(input == cappuchino){
                 water -= 200
                 milk -= 100
                 beans -= 12
                 money += 6
                 cups -= 1
            }
        }
        "fill" -> {
            fill()
        }
        "take" -> {
            takeMoney()
        }
    }

}

private fun fill() {
    println("Write how many ml of water do you want to add:")
    val newWater = readLine()!!.toInt()
    println("Write how many ml of milk do you want to add:")
    val newMilk = readLine()!!.toInt()
    println("Write how many grams of coffee beans do you want to add:")
    val newBeans = readLine()!!.toInt()
    println("Write how many disposable cups of coffee do you want to add:")
    val newCups = readLine()!!.toInt()

    //additions
    water += newWater
    milk += newMilk
    beans += newBeans
    cups += newCups

    return
}
private fun takeMoney () {
    money -= money
}

