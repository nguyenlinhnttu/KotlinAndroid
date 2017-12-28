package com.example.kotlinandroid.view.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.kotlinandroid.R
import com.example.kotlinandroid.view.model.People

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class RecyclerViewActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        recyclerView = findViewById(R.id.recycler_view)
        var arrPeople: ArrayList<People> = ArrayList()
        arrPeople.add(People("Linh", 99))
        arrPeople.add(People("Kim", 99))
        arrPeople.add(People("Minh", 99))
        arrPeople.add(People("Thanh", 99))

        var adapter = CustomAdapter(this, arrPeople)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        recyclerView.adapter = adapter
    }
}