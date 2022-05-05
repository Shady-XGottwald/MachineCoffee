 class Pumpkin1(val type: String, val isForHalloween: Boolean) {

    // create function addCandle()
     init{
         if(isForHalloween){
             val i = Candle1().burning()
         }
        else{
            addCandle()

        }
     }
     fun addCandle() {
         println("We don't need candles.")
     }

    inner class Candle1 {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
    }
}
 private fun main() {
     val w : Pumpkin1= Pumpkin1("halloween" ,true)
 }