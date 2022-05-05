import kotlin.random.Random
class Player(val id: Int = Random.nextInt(), val name: String, val hp: Int ){
    companion object {

        fun create(name: String): Player {
            return Player(Random.nextInt(), name,hp =100)
        }
    }


}
fun main() {
    val n = Player.create("SHady")
    println(n.name)
    val b = Player.Companion
    b.create("w")
    println(b.create("s").name)

}