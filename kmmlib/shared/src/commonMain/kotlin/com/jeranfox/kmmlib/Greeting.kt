package com.jeranfox.kmmlib

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}