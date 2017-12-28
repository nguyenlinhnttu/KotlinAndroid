package com.example.kotlinandroid.view.listview.custom

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.example.kotlinandroid.R
import kotlinx.android.synthetic.main.activity_custom_listview.*

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class CustomListViewActivity :AppCompatActivity(){
    lateinit var lvCustom  : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_listview)
        lvCustom = findViewById(R.id.lv_custom)

        var arrPeople :ArrayList<People> = ArrayList()
        arrPeople.add(People("Linh", 22))
        arrPeople.add(People("Kim", 21))
        arrPeople.add(People("Minh", 22))
        arrPeople.add(People("Thanh", 21))
        lv_custom.adapter = CustomLvAdapter(arrPeople, this)
    }
}