package com.BartBoys3.theQuestOfTheBreadstick

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.util.*

fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) +  start

object globalFuns {
    fun StartMidi(fileInMusicDir: String) {
        sequencer.open()
        inputStream = BufferedInputStream(FileInputStream(File("c:/users/bartboys3/music/${fileInMusicDir}")))
        sequencer.setSequence(inputStream)
        sequencer.start()
    }
}