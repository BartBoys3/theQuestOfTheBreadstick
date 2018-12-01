package com.BartBoys3.theQuestOfTheBreadstick

import java.awt.Graphics
import java.lang.NumberFormatException

fun fightScene(badsName: String = "NAME_NOT_PASSED",currentTurn: Int = 1, playerInit: Boolean = false, battleMenu: String = "MENU_NOT_PASSED") {
    var currentTurnVar = currentTurn
    if (playerInit==false) {var fightInitTemp = badsName; var fightInitOnTemp = "You"; // <- player init fight on bad v.s. bad init fight on player
        println("${fightInitTemp} Initaited a fight against ${fightInitOnTemp}")}      // <-
    else {var fightInitTemp = "You"; var fightInitOnTemp = badsName;                   // <-
        println("${fightInitTemp} Initaited a fight against ${fightInitOnTemp}")}      // <-

    fun BattleMenu(): Int {
        println(battleMenu)
        var battleChoiceToInt:Int = 0
        var battleChoicePreInt = readLine().toString()

        try {
            battleChoiceToInt = battleChoicePreInt.toInt()
        }
        catch (NumberFormatException: Throwable) {
            println("Please Enter A Number Shown in the Menu.")
            BattleMenu()
        }
        if (battleChoiceToInt<1){
            println("Please Enter a Number Shown in the Menu.")
            BattleMenu()
        }
        if (battleChoiceToInt>6){
            println("Please Enter a Number Shown in the Menu.")
            BattleMenu()
        }
        currentTurnVar++
        return battleChoiceToInt
    }
    var returnedBattleChoice = BattleMenu()
    when (returnedBattleChoice) {
        1 -> initMeleeAttacks().forEach { class tempClass () }
        2 -> println()
        3 -> println()
        4 -> println()
        5 -> println()
        6 -> println()
    }

}
