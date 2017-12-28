package com.example.kotlinandroid.basic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.kotlinandroid.R
import com.example.kotlinandroid.basic.model.Student
import com.example.kotlinandroid.basic.model.StudentData
import com.example.kotlinandroid.basic.oop.Dog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*------- LESSON 1--------*/
        var TAG: String = "LESSON 1"
        var name: String = ""
        name = "10"
        name.toInt()
        Log.d(TAG, name)

        val NAME: String = "LINH"

        /*------- LESSON 2: SAFE NULL
                ? --------*/
        var allowNull: String? = ""
        allowNull = null

        var notAllowNull: String = ""!!
        //Can't set Null

        /*------- LESSON 3: IF ELSE--------*/
        TAG = "LESSON 3"
        var a: Int = 10
        var b: Int = 20
        if (a > b)
            Log.d(TAG, "A > B")
        else
            Log.d(TAG, "B > A")

        /*------- LESSON 4: WHEN-------*/
        TAG = "LESSON 4"
        //Sample 1
        var a2: Int = 10
        when (a2) {
            10 -> Log.d(TAG, "Gia Tri La 10")
            20 -> Log.d(TAG, "Gia Tri La 20")
            30 -> Log.d(TAG, "Gia Tri La 30")
        }

        //Sample 2
        var month: Int = 15
        when (month) {
            in 1..3 -> Log.d(TAG, "Quy 1") // in dung cho 1 khoang gia tri
            in 4..5 -> Log.d(TAG, "Quy 2")
            7, 8, 9 -> Log.d(TAG, "Quy 3")
            10, 11, 12 -> Log.d(TAG, "Quy 4")
            else -> Log.d(TAG, "Khong Co Gia Tri Phu Hop!!!")  // Optinal
        }

        /*------- LESSON 5: WHILE-------*/
        TAG = "LESSON 5"
        var whileValue: Int = 10
        while (whileValue < 20) {
            Log.d(TAG, "Gia Tri Lan Luot La:" + whileValue)
            whileValue++
        }

        /*------- LESSON FOR: -------*/
        TAG = "LESSON 6"
        var forValue: Int = 10
        for (i in 0..forValue) {
            Log.d(TAG, "Type 1: Gia Tri For La:" + i)
        }

        for (i in 0 until forValue) {
            Log.d(TAG, "Type 2: Gia Tri For La:" + i)
        }

        for (i in 0 downTo forValue) {
            Log.d(TAG, "Type 3: Gia Tri For La:" + i)
        }

        //Moi lan chay tang 2 gia tri
        for (i in 0..forValue step 2) {
            Log.d(TAG, "Type 4: Gia Tri For La:" + i)
        }

        /*------- LESSON 7 ARRAY: -------*/
        TAG = "LESSON 7"
        var mangso: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var value: String = mangso[0].toString()
        var value2: String = mangso.get(5).toString()
        Log.d(TAG, "Cach 1" + value.toString() + "___" + value)

        var listString: List<String> = listOf("Linh", "Kim", "Minh")
        value = listString[0]
        value2 = listString.get(2)

        Log.d(TAG, "Cach 2" + value.toString() + "___" + value)

        var arrString: ArrayList<String> = ArrayList();
        arrString.add("Linh 2")
        arrString.add("Kim 2")
//        arrString.removeAt(1)
//        arrString.remove("Linh 2")
//        arrString.set(0,"Thanh 2")
//        arrString.get(1)
        Log.d(TAG, "Check Size: " + arrString.size)

        /*------- LESSON 7 FUNCTION: -------*/
        showName();
        showName("Kim");
        showName(null);

        /*------- LESSON 8 OOP: -------*/
        var student1 = Student()
        student1.setName("Linh");
        student1.setAge(22)
        Log.d("OOP STUDENT: ", student1.getName() + "\n" + student1.getAge())


        /*------- LESSON 9 CLASS DATA: -------*/
        var studentDT = StudentData("Linh2", 22)
        Log.d("CLASS DATA: ", studentDT.name + "\n" + studentDT.age)
        Log.d("CLASS DATA: ", "DATA ${studentDT.name} + ${studentDT.age}")

        /*------- LESSON 10 First Android: -------*/
        tv_hello.text = "Hello Kotlin Android"

        //Type Click 1
        tv_hello.setOnClickListener {
            Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()

            //Type Click 2
            tv_hello.setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    Toast.makeText(this@MainActivity, "Click! 2", Toast.LENGTH_SHORT).show()
                }

            })
        }
        /*------- LESSON 11 Extent Object: -------*/
        TAG = "LESSON 11"
        var dog = Dog("Loai 1")
        dog.setColor("Den")
        dog.setName("Kim Kim")
        dog.setSound("Gau Gau")
        Log.d(TAG, dog.getName() + "\t" + dog.type + "\t" + dog.getColor() + "\t" + dog.getSound())

    }

    fun showName() {
        Log.d("Func showName: ", "Linh")
    }

    fun showName(name: String?) {
        if (name != null) {
            Log.d("Func showName: ", name)
        } else {
            Log.d("Func showName: ", "NULL")
        }

    }

}
