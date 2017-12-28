package com.example.kotlinandroid.basic.oop

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
open class Animal {
    private var name: String = ""
    private var color: String = ""
    private var sound: String = ""

    constructor()

    constructor(name: String, color: String) {
        this.name = name
        this.color = color
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name;
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getColor(): String {
        return color;
    }

    fun setSound(sound: String) {
        this.sound = sound
    }

    fun getSound(): String {
        return sound;
    }
}