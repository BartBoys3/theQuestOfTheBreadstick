package com.BartBoys3.theQuestOfTheBreadstick

object Gear {
    var storageEquip = "Backpack"
    var helmet = "${heroname}'s Dirty Baseball Cap"
    var chest = "${heroname}'s T-Shirt"
    var legs = "${heroname}'s Basketball Shorts"
    var boots = "${heroname}'s Fresh Sneakers"
    var melee = "Rusty Sword"
    var ranged = null
    object Inv{
        var inventoryString: MutableList<String> = ArrayList()
        var itemCount: MutableList<Int> = ArrayList()
        fun itemGet(item: String, quantity: Int) {
            inventoryString.add(item)
            itemCount.add(inventoryString.lastIndex,quantity)
        }
    }
}
