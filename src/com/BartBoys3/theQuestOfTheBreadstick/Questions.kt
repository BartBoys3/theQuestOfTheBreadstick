package com.BartBoys3.theQuestOfTheBreadstick
fun askQuest(num: Int) {
    when (num) {
        0 -> optmenu(arrayOf("Hunt", "View Gear/Inventory", "Enter Forest", "Rest", "N/A"),num)
        1 -> optmenu(arrayOf("Hunt", "View Gear", "Enter Forest", "N/A", "N/A"),num)
        2 -> optmenu(arrayOf("Hunt", "View Gear", "Enter Forest", "N/A", "N/A"),num)
        3 -> optmenu(arrayOf("Hunt", "View Gear", "Enter Forest", "N/A", "N/A"),num)
        4 -> optmenu(arrayOf("Hunt", "View Gear", "Enter Forest", "N/A", "N/A"),num)
        5 -> optmenu(arrayOf("Hunt", "View Gear", "Enter Forest", "N/A", "N/A"),num)
        -1 -> optmenu(arrayOf("Toss","N/A","N/A","N/A","Exit to Previous Options Menu."),num)
        else -> {
            println("OPTION_PASSING_EXECPTION")
        }
    }
}