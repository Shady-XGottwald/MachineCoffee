class Car(val make: String, val year: Int) {

    private var speed: Int = 0
    // write the methods here
     fun accelerate ():Int {
        speed += 5
       return speed
    }
     fun decelerate ():Int {

        if(speed <= 0) {
            speed = 0
            return speed
        }
        else{
            speed -= 5
            return  speed}
    }


}

fun main () {
    var c = Car("Honda",2000).decelerate()
    println(c)
   // println(c.accelerate())
}