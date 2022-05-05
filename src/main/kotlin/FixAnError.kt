
class Player1(val id: Int, val name: String) {
    companion object {
        var role = "playable character"
        //fun getInfo() = "${}, ${}, $role"
    }
    fun getInfo() = "${this.id}, ${this.name}, $role"
}

fun getPlayerInfo(player: Player1): String {
      var n = player.getInfo()
    n = "NPC"
    return player.getInfo()
}
