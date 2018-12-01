package com.BartBoys3.theQuestOfTheBreadstick

import java.lang.reflect.*

class ClassDemo {

    var string1 = "tutorialspoint"

    constructor() {
        // no argument constructor
    }

    constructor(string1: String) {
        this.string1 = string1
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val c = ClassDemo()
            val cls = c.javaClass

            println("Field =")

            try {
                // string field
                val sField = cls.getField("string1")
                println("Public field found: " + sField.toString())
            } catch (e: NoSuchFieldException) {
                println(e.toString())
            }

        }
    }
}