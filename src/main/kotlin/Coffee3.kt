
private fun main () {
    println("Write how many ml of water the coffee machine has:")
    val water = readLine()!!.toInt()
    println("Write how many ml of milk the coffee machine has: ")
    val milk = readLine()!!.toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val coffee = readLine()!!.toInt()
    println("Write how many cups of coffee you will need:")
    val cups = readLine()!!.toInt()

    //compare variables
    val w = water / 200
    val m = milk / 50
    val c = coffee / 15
    val min = minOf(w, m, c)


    //Checking whether cups will be made
    //Base condition  default values
    if (water % 200 == 0 && milk % 50 == 0 && coffee % 15 == 0 && cups <= 0) {
        println("Yes, I can make that amount of coffee (and even 1 more than that)")
    }
    else  if(water == 0 && milk == 0 && coffee == 0 && cups == 0) {
       println("Yes,I can make that amount of coffee")
   }
    else if(min == cups) {
        println("Yes,I can make that amount of coffee")

    }
    else if(min < cups){
        println("No, I can make only $min cups of coffee")
    }
    else if (min > cups){
        println("Yes,I can make that amount of coffee (and even ${min - cups} more than that)")
    }

}






