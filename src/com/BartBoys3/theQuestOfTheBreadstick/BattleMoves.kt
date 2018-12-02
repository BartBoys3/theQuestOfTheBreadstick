package com.BartBoys3.theQuestOfTheBreadstick

import java.lang.reflect.*
import java.util.stream.Collector
import kotlin.reflect.KCallable
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf
import kotlin.reflect.jvm.kotlinProperty

open class MeleeAttack (@JvmField val attackName: String = "", @JvmField val damage: Double = .0,@JvmField val recoilMultiplier: Double = 5.0,@JvmField val criticalChance: Double = .0,@JvmField val accuracy: Double = .0) {
    open inner class Headbutt : MeleeAttack("Headbutt", 12.0, 0.0, 10.0, 95.0)
    open inner class StandardPunch : MeleeAttack()
}
fun initMeleeAttacks(): Array<Class<*>> {
    return MeleeAttack().javaClass.declaredClasses
}




