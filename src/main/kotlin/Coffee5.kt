
private fun main() {
    val exit = "exit"
    val buy = "buy"
    val fill = "fill"
    val take = "take"
    val remaining = "remaining"
    do {
        println("Write action (buy, fill, take, remaining, exit):")

        val initInput = readLine()!!.toString()
        when(initInput){
            remaining -> {start()}
            take -> {takeMoney()}
            fill -> {fill()}
            buy -> {buy()}

        }
    }
    while(initInput != exit)

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
private fun takeMoney () {
    println("I gave you $money")
    money -= money
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

private fun buy () {
    println("What do you want to buy?  1 - espresso, 2 - latte, 3 - cappuccino , back - to main menu:")


        val input = readLine()!!.toString()
      if(input == "back"){
          return
      }

        when (input) {
            espresso -> {
                buyEspresso()
            }
            latte -> {
                buyLatte()
            }
            cappuchino -> {
                buyCappuccino()
            }
        }
        return

}

private fun buyEspresso () {
    val noWater = (water )
    if(water < 250  ){
        println("Sorry, not enough water!") }
    else{
        water -= 250
        beans -= 16
        money += 4
        cups -= 1
        println("I have enough resources, making you a coffee!")

    }
}
private fun buyLatte () {
    if(water < 350  ){ println("Sorry, not enough water!") }
    else{
        water -= 350
        milk -= 75
        beans -= 20
        money += 7
        cups -= 1
        println("I have enough resources, making you a coffee!")
    }

}
private fun buyCappuccino () {
    if(water < 200  ){ println("Sorry, not enough water!") }
    else{
        water -= 200
        milk -= 100
        beans -= 12
        money += 6
        cups -= 1
        println("I have enough resources, making you a coffee!")
    }
}

/*      if(milk < 75){ println("Sorry, not enough milk!")}
    if ( beans < 20){println("Sorry, not enough coffee beans!")}

        if(milk < 100){ println("Sorry, not enough milk!")}
    if ( beans < 12){println("Sorry, not enough coffee beans!")}

     if(milk < 75){ println("Sorry, not enough milk!")}
    if ( beans < 20){println("Sorry, not enough coffee beans!")}

    */