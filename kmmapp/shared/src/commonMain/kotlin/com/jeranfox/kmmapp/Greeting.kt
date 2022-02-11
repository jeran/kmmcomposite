package com.jeranfox.kmmapp

import com.jeranfox.kmmlib.LibGreeting

class Greeting {
    fun greeting(): String {
        return LibGreeting().greeting()
    }
}