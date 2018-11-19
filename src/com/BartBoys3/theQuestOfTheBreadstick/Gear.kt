package com.BartBoys3.theQuestOfTheBreadstick

object Gear {
    var storageEquip = "${heroname}'s Backpack"
    var helmet = "${heroname}'s Dirty Baseball Cap"
    var chest = "${heroname}'s T-Shirt"
    var legs = "${heroname}'s Basketball Shorts"
    var boots = "${heroname}'s Fresh Sneakers"
    var melee = "Rusty Sword"
    var ranged = null

    object Inv {
        var inventoryString: MutableList<String> = ArrayList()
        var itemCount: MutableList<Int> = ArrayList()
        fun itemGet(item: String, quantity: Int) {
            inventoryString.add(item)
            itemCount.add(inventoryString.lastIndex, quantity)
        }

        fun tossItem(item: String, quantity: Int) {
            if (quantity >= 0) {
                itemCount[inventoryString.indexOf(item)] = ((itemCount[inventoryString.indexOf(item)]) - quantity)
                if (itemCount[inventoryString.indexOf(item)] <= 0) {
                    itemCount.removeAt(itemCount[inventoryString.indexOf(item)])
                    inventoryString.remove(item)
                }
            else { println("You are not allowed to toss items in negitave quantities.") }
            }
        }
    }
}