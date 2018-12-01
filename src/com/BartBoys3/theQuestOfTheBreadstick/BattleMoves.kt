package com.BartBoys3.theQuestOfTheBreadstick

import java.lang.reflect.*
import java.util.stream.Collector
import kotlin.reflect.KCallable
import kotlin.reflect.jvm.kotlinProperty

open class MeleeAttack (attackName: String = "nill",damage: Double = 0.0, recoilMultiplier: Double = 0.0,critChance: Double = 0.0,missChance: Double = 0.0) {
    //open class Headbutt : MeleeAttack("Headbutt", 12.0, 0.0, 10.0, 0.0)
    open class StandardPunch : MeleeAttack() {
        val attackName = "Standard Punch"
    }
}
fun initMeleeAttacks(): Array<out Class<*>> {
    var meleeAttacks = MeleeAttack().javaClass.nestMembers
    return meleeAttacks
}




