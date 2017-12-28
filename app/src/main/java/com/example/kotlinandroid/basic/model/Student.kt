package com.example.kotlinandroid.basic.model

/**
 * Created by nguyenvanlinh on 12/27/17.
 */
class Student {
    private var name: String = ""

    private var age: Int = 0

    constructor()

    constructor(name: String, age: Int) {
            this.name = name
            this.age = age
    }

    fun  getName() : String{
        return name;
    }

    fun getAge() :Int {
        return  age;
    }

    fun  setName(name: String){
        this.name = name
    }

    fun  setAge(age: Int){
        this.age = age
    }
}