class Cell {
    object BaseProperties {
        var width = 10
        var height = 10
    }
}
fun main() {
    var cell = Cell.BaseProperties.height
    println(cell)

}