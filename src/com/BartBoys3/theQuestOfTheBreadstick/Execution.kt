package com.BartBoys3.theQuestOfTheBreadstick

fun select(questToExec: Int) {
    when (optdb[questToExec]) {
        0 -> quest0(optdb[questToExec])
    }
}

fun quest0(anwser: Int) {
    println("Hai!")
}