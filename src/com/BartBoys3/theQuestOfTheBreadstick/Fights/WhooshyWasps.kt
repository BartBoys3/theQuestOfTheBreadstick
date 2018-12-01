package com.BartBoys3.theQuestOfTheBreadstick.Fights

import com.BartBoys3.theQuestOfTheBreadstick.ASCIIart
import com.BartBoys3.theQuestOfTheBreadstick.globalFuns
import com.BartBoys3.theQuestOfTheBreadstick.MusicVars
import com.BartBoys3.theQuestOfTheBreadstick.fightScene

object WhooshyWasps {
    fun whooshyWasps() {
        println("you encounter an agressive, giant, antimorphic tree who has a nametag above his head reading \"Whooshy Wasps\".")
        println("*For no particular reason whatsoever, I (The Programmer) would like to state that, \"Any resemblance to actual events or locales or characters or persons, living or dead, fictional or not, is entirely coincidental.\"")
        globalFuns.StartMidi(MusicVars.fightTheme)
        fightScene("Whooshy Wasps",1,false,ASCIIart.whooshyWaspsBattleMenu())
    }
}