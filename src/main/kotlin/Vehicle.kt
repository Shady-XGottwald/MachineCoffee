
private class Vehicle (val name: String){
    // add name
    fun name(): String {
        return name
    }

    // create constructor

    inner class Engine(val hp: Int) {
        // add horsePower
        fun horsePower(): Int{
            return hp
        }

        // create constructor

        fun start() {
            println("RRRrrrrrrr....")
        }

        // create function printHorsePower()
        fun printHorsePower() {
            println("the ${name()} Vehicle has ${horsePower()} horsepower")
        }
    }
}
fun main() {
    val i: Vehicle.Engine = Vehicle("Dixie").Engine(20)
    i.printHorsePower()
    val p = Vehicle("Water").Engine(1).printHorsePower()

   // val n = Vehicle1("Dixie").Engine(20).printHorsePower()
}


//Not mine
class Vehicle1(val name: String) {
    // add name

    // create constructor

    inner class Engine(val horsePower: Int) {
        // add horsePower

        // create constructor

        fun start() {
            println("RRRrrrrrrr....")
        }

        // create function printHorsePower()
        fun printHorsePower() {
            println("The $name vehicle has $horsePower horsepower.")
        }
    }
}
