package com.example.kotlinandroid.view.listview.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinandroid.R
import com.example.kotlinandroid.view.model.People

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class CustomLvAdapter : BaseAdapter {
    private var arrName: ArrayList<People> = ArrayList()
    private var mContext: Context?

    constructor(arrName: ArrayList<People>, mContext: Context?) : super() {
        this.arrName = arrName
        this.mContext = mContext
    }


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var people: People = getItem(p0) as People
        var view: View? = p1
        if (p1 == null) {
            var layoutInflater: LayoutInflater = LayoutInflater.from(mContext)
            view = layoutInflater.inflate(R.layout.item_list_view, null)
            var tvName: TextView = view.findViewById(R.id.tv_name)
            var tvAge: TextView = view.findViewById(R.id.tv_age)
            tvName.text = people.name
            tvAge.text = people.age.toString()
            //Set Click Item
            view.setOnClickListener(View.OnClickListener {
                Toast.makeText(mContext, people.name, Toast.LENGTH_SHORT).show()
            })

        }
        return view as View
    }

    override fun getItem(p0: Int): Any {
        return arrName.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return arrName.size
    }

}