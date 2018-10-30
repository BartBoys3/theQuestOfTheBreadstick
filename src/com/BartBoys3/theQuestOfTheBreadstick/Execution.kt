package com.BartBoys3.theQuestOfTheBreadstick

import kotlin.math.absoluteValue

fun select(questToExec: Int) {
    when (questToExec) {
        0 -> quest0("${optdb[questToExec]}".toInt(), questToExec)
        else -> {
            println("QUESTION_NUMBER_PASSING_EXECPTION")
            println("PLEASE_TERMINATE_PROGRAM")
        }
    }
}
fun rest(returnQuest: Int) {
    println("How Many Days Would You Like To Rest?")
    var daysToRest = readLine().toString().toInt().absoluteValue
    addDay(daysToRest)
    askQuest(returnQuest)
}
fun quest0(anwser: Int, quest: Int) {
    when (anwser) {
        /*1 ->
        2 ->
        3 ->*/
        4 -> rest(quest)
        /*5 ->
    */}
}/*
fun quest1(anwser: Int) {
    when (anwser) {
        1 ->
        2 ->
        3 ->
        4 ->
        5 ->
    }
}fun quest2(anwser: Int) {
    when (anwser) {
        1 ->
        2 ->
        3 ->
        4 ->
        5 ->
    }
}
fun quest3(anwser: Int) {
    when (anwser) {
        1 ->
        2 ->
        3 ->
        4 ->
        5 ->
    }
}fun quest4(anwser: Int) {
    when (anwser) {
        1 ->
        2 ->
        3 ->
        4 ->
        5 ->
    }
}*/

