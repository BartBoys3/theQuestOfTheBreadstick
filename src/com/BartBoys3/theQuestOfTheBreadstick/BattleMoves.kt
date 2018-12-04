package com.BartBoys3.theQuestOfTheBreadstick

import java.lang.reflect.*
import java.util.stream.Collector
import kotlin.reflect.KCallable
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf
import kotlin.reflect.jvm.kotlinProperty
var attackList: MutableList<Attack> = ArrayList<Attack>(255)
data class Attack (var attackName: String = "none",var damage: Double = .0,var recoilMultiplier: Double = 5.0,var criticalChance: Double = .0,var accuracy: Double = .0,var type: Byte = 0, var unlocked: Boolean = false) {
    init {
        if (this.unlocked) {
            attackList.add(this)
        }
    }
}
val headbutt = Attack("Headbutt", 50.0, 0.0, 5.0, 95.0, 0, true)





