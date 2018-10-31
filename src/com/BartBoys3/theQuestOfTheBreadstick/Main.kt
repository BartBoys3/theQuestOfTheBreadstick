package com.BartBoys3.theQuestOfTheBreadstick

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue

val title = "The Quest Of The Breadstick"
var day:Short = 1
var optdb: MutableList<Int> = ArrayList<Int>()
val opttext= "Select an option."
fun main(args: Array<String>) {
    println("Welcome to "+ title)
    println("Enter the name of the hero:")
    TextV heroname = readLine().toString()
    startgame()
}

fun optmenu(opts: Array<String>,questnum: Int) {
println("The Day is "+ day)
println(opttext)
println("1. ${opts[0]}")
println("2. ${opts[1]}")
println("3. ${opts[2]}")
println("4. ${opts[3]}")
println("5. ${opts[4]}")
println("Number Here")
optdb.add(0)
optdb[questnum] = readLine().toString().toInt()
    afterOpt(questnum)
}
fun startgame() {
    println("Your journey starts in the small village of Hickory Peaks.")
    println("You gotta defeat some evil dude to get back your breadstick.")
    println()
    askQuest(0)
}
fun afterOpt(lastQuest: Int) {
    select(lastQuest)
}
fun addDay(n: Int) {
    if (day+n>255) {
       day= ((255-day)-1).toShort()
    }
    else {
        if (day+n<0) {
            day=((255-(n.absoluteValue))+2).toShort()
        }
        else {
            day=(day+n).toShort()
        }
    }
}
