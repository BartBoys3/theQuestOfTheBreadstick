import org.jetbrains.kotlin.codegen.intrinsics.ArrayOf
import java.util.*

val title = "The Quest Of The Breadstick"
var date = Date(118,9,20)
var optdb: Array<Int> = (arrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
val opttext= "Select an option."
fun main(args: Array<String>) {
    println("Welcome to the "+title)
    println("Enter the name of the hero:")
    val heroname = readLine().toString()
    startgame()
}

fun optmenu(opts: Array<String>,optnum: Int) {
println(opttext)
println("1. ${opts[0]}")
println("2. ${opts[1]}")
println("3. ${opts[2]}")
println("4. ${opts[3]}")
println("5. ${opts[4]}")
println("Number Here")
optdb[optnum] = readLine().toString().toInt()
    println("${optdb[0]}")
    afterOpt()
}
fun startgame() {
    println("Your journey starts in the small village of Hickory Peaks.")
    println("You gotta defeat some evil dude to get back your breadstick.")
    optmenu(arrayOf("Hunt","View Gear","Enter Forest","N/A","N/A"),0)
}
fun afterOpt() {
    print("test")
}