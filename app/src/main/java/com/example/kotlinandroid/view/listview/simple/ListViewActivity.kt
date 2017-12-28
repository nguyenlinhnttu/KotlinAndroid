package com.example.kotlinandroid.view.listview.simple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.kotlinandroid.R
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        var arrName : ArrayList<String> = ArrayList()
        arrName.add("Linh")
        arrName.add("Kim")
        arrName.add("Minh")
        arrName.add("Thanh")
        lv_simple.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrName);
        lv_simple.onItemClickListener = AdapterView.OnItemClickListener { p0, p1, p2, p3 ->
            Toast.makeText(this, arrName.get(p2),Toast.LENGTH_SHORT).show()
        }


    }
}
