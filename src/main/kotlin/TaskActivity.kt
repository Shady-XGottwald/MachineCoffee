
class Task(val name: String)
// create the Manager singleton here
    object Manager {
    var taskSolved: Int = 0
        fun solvedTask(name: Task){

            println("Task ${name.name} solved!")
            taskSolved += 1
        }
    }


fun main () {
    val n = Task("shady")
    val r = Manager.solvedTask(n)
    println(Manager.taskSolved)

}