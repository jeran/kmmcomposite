package com.jeranfox.kmmlib

class LibGreeting {
    fun greeting(): String {
        return "Hello from kmmlib, ${Platform().platform}!"
    }
}