import java.lang.Math.abs
import java.math.*
import kotlin.math.nextTowards

object Math {

    fun absInteger(value: Int):Int{
      //  return abs(value)
        return kotlin.math.abs(value)
    }

    fun absDouble(value: Double): Double {
       // return abs(value)
        return kotlin.math.abs(value)
    }
}

private fun main (){
    val m = Math.absInteger(-25)
    println(m)
    val n = Math.absDouble(-2.4777)
    println(n)
}