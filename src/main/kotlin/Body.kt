
private class Vehicle2(val name: String) {
    // add name
//The Dixi vehicle has a red body.
    // create constructor
    // create inner class Body
    inner class Body(val color: String){
        fun printColor() {
            println("The $name Vehicle has a $color body")
        }
    }
}
private fun main() {
    val i = Vehicle2("Dixie").Body("red").printColor()

}