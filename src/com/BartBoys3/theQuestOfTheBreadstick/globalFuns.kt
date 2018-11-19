package com.BartBoys3.theQuestOfTheBreadstick

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

object globalFuns {
    fun StartMidi(FileMusicDir: String) {
        sequencer.open()
        inputStream = BufferedInputStream(FileInputStream(File("c:/users/bartboys3/music/${FileMusicDir}")))
        sequencer.setSequence(inputStream)
        sequencer.start()
    }
}