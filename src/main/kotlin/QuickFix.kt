
class Player2(val id: Int, name: String) {
    companion object {
        val defaultSpeed = 8
        val maxSpeed = 13

        fun calcMovePenalty(cell: Int): Int {
            return defaultSpeed - cell % 3
        }
    }
}

fun calculatePlayerSpeed(cell: Int): Int {
    return Player2.calcMovePenalty(cell)
}