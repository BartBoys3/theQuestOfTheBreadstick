package com.BartBoys3.theQuestOfTheBreadstick

import com.BartBoys3.theQuestOfTheBreadstick.Fights. *
import kotlin.math.absoluteValue
var negativeOgQuest: Int = 0
fun select(questToExec: Int) {
    when (questToExec) {
        0 -> quest0("${optdb[questToExec]}".toInt(), questToExec)
        -1 -> invOptsMenuExec(negativeQuestTempStorage, questToExec)
        else -> {
            println("QUESTION_NUMBER_PASSING_EXECPTION")
            println("PLEASE_TERMINATE_PROGRAM")
        }
    }
}
fun rest(returnQuest: Int) {
    println("How Many Days Would You Like To Rest?")
    var daysToRest = readLine().toString().toInt().absoluteValue
    addDay(daysToRest)
    askQuest(returnQuest)
}
fun gear(ogQuest: Int) {
    println(TextVars.viewGear)
    println("Helmet: ${Gear.helmet}\nChestpiece: ${Gear.chest}\nLegs: ${Gear.legs}\nFeet: ${Gear.boots}\nMelee Weapon: ${Gear.melee}\nRanged Weapon: ${Gear.ranged}")
    println("Inventory: "); Gear.Inv.inventoryString.forEach { println(it+" x"+"${Gear.Inv.itemCount[Gear.Inv.inventoryString.lastIndex]}") }
    negativeOgQuest = ogQuest
    askQuest(-1)
}
fun quest0(anwser: Int, quest: Int) {
    when (anwser) {
        //1 ->
        2 -> gear(quest)
        3 -> {println(TextVars.enterTheForest); com.BartBoys3.theQuestOfTheBreadstick.Fights.WhooshyWasps.whooshyWasps()}
        4 -> rest(quest)
        /*5 ->
    */}
}
fun invOptsMenuExec(anwser: Int, quest: Int) {
    when (anwser) {
        1 -> {println("Enter the EXACT name of the item you want to toss. (Case Sensitive)")
            var tossItemTemp = readLine().toString()
        println("Enter the amount of that item you want to toss in standard form. eg: 6 not six.")
        Gear.Inv.tossItem(tossItemTemp,readLine().toString().toInt())
        askQuest(-1)}
        2 -> {println("Invalid Option"); askQuest(quest)}
        3 -> {println("Invalid Option"); askQuest(quest)}
        4 -> {println("Invalid Option"); askQuest(quest)}
        5 -> {askQuest(negativeOgQuest)}
    }
}