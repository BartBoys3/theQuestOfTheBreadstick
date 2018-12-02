package com.BartBoys3.theQuestOfTheBreadstick

import java.awt.Graphics
import java.lang.NumberFormatException
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
import kotlin.reflect.jvm.kotlinFunction
import kotlin.reflect.jvm.kotlinProperty

fun fightScene(badsName: String = "NAME_NOT_PASSED",currentTurn: Int = 1, playerInit: Boolean = false, battleMenu: String = "MENU_NOT_PASSED", badsHealth: Double = 1000.00) {
    var currentTurnVar = currentTurn
    var badsHealthVar = badsHealth
    if (playerInit==false) {
    println("${badsName} initaited a fight against ${heroname}")}
    else {println("${heroname} initaited a fight against ${badsName}")}


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
    var attackNameTemp = "Could Not Assign Name"
    var returnedBattleChoice = BattleMenu()
    var clazz: MeleeAttack = MeleeAttack()
    var objact = Java.objclazz(MeleeAttack())
    when (returnedBattleChoice) {
        1 -> initMeleeAttacks().forEach { it.fields.forEach { println(it.get(objact)) } }
        2 -> println()
        3 -> println()
        4 -> println()
        5 -> println()
        6 -> println()
    }
    fun attackSequence(attack: MeleeAttack) {
        var tempCritFlag = false
        var tempLocalDamage = attack.damage
        var tempMissFlag = false
        println("$heroname used ${attack.attackName}")
        if (IntRange(1,100).random()<=attack.criticalChance) {tempCritFlag = true; tempLocalDamage*1.25}
        if (IntRange(1,100).random()>attack.accuracy) {tempMissFlag = true}
        if (tempMissFlag) {
             println("The attack missed!")
        }
        else  {
            if (tempCritFlag) {
                    println("Cirtical Hit!!")
            }
            badsHealthVar-tempLocalDamage
            if (attack.recoilMultiplier>0.0) {
                println("$heroname got damaged by recoil!")
                health-(tempLocalDamage*attack.recoilMultiplier)
            }
        }
    }
}
