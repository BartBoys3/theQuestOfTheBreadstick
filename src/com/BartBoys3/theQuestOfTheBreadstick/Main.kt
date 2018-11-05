package com.BartBoys3.theQuestOfTheBreadstick
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue
    val title = "The Quest Of The Breadstick"
    var day: Short = 1
    var optdb: MutableList<Int> = ArrayList<Int>(255)
    var heroname:String? = null
    var negativeQuestTempStorage: Int = 0
    var health = 1000.00
    val opttext = "Select an option."
    fun main(args: Array<String>) {
        println("Welcome to " + title)
        println("do not enter anything stupid into a prompt or else the game is very likely to terminate.".toUpperCase())
        Heraname.startgame()
    }

    fun optmenu(opts: Array<String>, questnum: Int) {
        if (questnum >= 0) {println("The Day is " + day)}
        println(opttext)
        println("1. ${opts[0]}")
        println("2. ${opts[1]}")
        println("3. ${opts[2]}")
        println("4. ${opts[3]}")
        println("5. ${opts[4]}")
        println("Number Here")
        if (questnum >= 0) {optdb.add(questnum, readLine().toString().toInt())}
        else {negativeQuestTempStorage = readLine().toString().toInt()}
        select(questnum)
    }

    fun addDay(n: Int) {
        if (day + n > 255) {
            day = ((255 - day) - 1).toShort()
        } else {
            if (day + n < 0) {
                day = ((255 - (n.absoluteValue)) + 2).toShort()
            } else {
                day = (day + n).toShort()
            }
        }
    }

 object Heraname {
     @JvmStatic
     public fun startgame() {
         println("Enter the name of the hero:")
         heroname = readLine().toString()
         println("Your journey starts in the small village of Hickory Peaks.")
         println("You gotta defeat some evil dude to get back your breadstick.")
         println()
         Gear.Inv.itemGet("Stick", 20)
         Gear.Inv.itemGet("Sticki", 20)
         askQuest(0)

     }
 }
