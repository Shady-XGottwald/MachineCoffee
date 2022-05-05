
class Pumpkin(val type: String, val isForHalloween: Boolean) {
    // create function addCandle()
    init{
        if(isForHalloween) {
            val i = Candle().burning()
        }
        else {
            val n = Candle().addCandle()
        }
    }

    inner class Candle {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
        fun addCandle() {
            println("We don't need candles.")
        }
    }
}
private fun main() {
    val pumpkin: Pumpkin = Pumpkin("Halloween",true)


}