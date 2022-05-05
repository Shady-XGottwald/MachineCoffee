
class Block(val color: String){
    object BlockProperties{
        private val length = 6
        const val width = 4

        fun blocksInBox(length: Double, width: Double): Int {
        //    val new = 0 // (9/4) * (14/6)  (9/4) * (14/6)
          //  val n =((this.length / length) * (this.width / width)).toInt()
            return ((length / this.length) * (width/ this.width)).toInt()


        }

    }
}

fun main() {
    val n = Block.BlockProperties.blocksInBox(14.0,9.0)
    println(n)
}