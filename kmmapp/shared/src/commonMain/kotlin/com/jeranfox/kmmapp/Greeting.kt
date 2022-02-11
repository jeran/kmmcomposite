package com.jeranfox.kmmapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}