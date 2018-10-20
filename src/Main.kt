import java.util.*

val title = "The Quest Of The Breadstick"
var date = Date(118,9,20)
var optdb: Array<Int>
val opttext= "Select an option."
fun main(args: Array<String>) {
    println("Welcome to the "+title)
    println("Enter the name of the hero:")
    val heroname = readLine().toString()
    startgame()
}

fun optmenu(opts: Array<String>,optnum: Int) {
println(opttext)
println("${opts[0]}")
println("${opts[1]}")
println("${opts[2]}")
println("${opts[3]}")
println("${opts[4]}")
print("Number Here")
optdb[optnum] = readLine().toString().toInt()
}
fun startgame() {
    println("Your journey starts in the small village of Hickory Peaks.")
    println("You gotta defeat some evil dude to get back your breadstick.")
    optmenu()
}