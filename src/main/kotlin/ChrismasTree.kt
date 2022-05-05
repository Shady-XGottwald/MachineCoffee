
class ChristmasTree(var color: String) {

    // create function putTreeTopper()
    fun putTreeTopper(): String {
        return color

    }
//The sparkling <topper color> tree topper looks stunning on the <tree color> Christmas tree!
    inner class TreeTopper(var color: String) {
        // create function sparkle()
        fun sparkle() {
            println("The sparkling <${this.color}> tree topper looks stunning on the <${putTreeTopper()}> Christmas tree!")

        }
    }
}
private fun main() {
    val c = ChristmasTree("Blue").TreeTopper("Silver").sparkle()
    val d = ChristmasTree("red").TreeTopper("silver").sparkle()
    val e = ChristmasTree1("red").putTreeTopper("silver")
}


class ChristmasTree1(var color: String) {

    fun putTreeTopper(color: String) {
        TreeTopper(color).sparkle()
    }

    inner class TreeTopper(var color: String) {

        fun sparkle() {
            println("The sparkling $color tree topper looks stunning on the ${this@ChristmasTree1.color} Christmas tree!")
        }
    }
}
