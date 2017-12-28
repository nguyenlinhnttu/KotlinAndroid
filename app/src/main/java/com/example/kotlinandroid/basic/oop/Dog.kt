package com.example.kotlinandroid.basic.oop

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class Dog : Animal {
    var type :String = ""

    constructor(type: String) : super() {
        this.type = type
    }

}