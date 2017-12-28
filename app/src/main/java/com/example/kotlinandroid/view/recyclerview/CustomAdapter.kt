package com.example.kotlinandroid.view.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kotlinandroid.R
import com.example.kotlinandroid.view.model.People

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class CustomAdapter : RecyclerView.Adapter<ItemHolder> {

    var mContext: Context
    var arrPeople: ArrayList<People> = ArrayList()

    constructor(mContext: Context, arrPeople: ArrayList<People>) : super() {
        this.mContext = mContext
        this.arrPeople = arrPeople
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemHolder {
        var inflater: View = LayoutInflater.from(mContext).inflate(R.layout.item_list_view, parent, false)
        return ItemHolder(inflater)
    }

    override fun getItemCount(): Int {
        return arrPeople.size
    }

    override fun onBindViewHolder(holder: ItemHolder?, position: Int) {
        var people = arrPeople.get(position)
        if (holder != null) {
            holder.tvName.text = people.name
            holder.tvAge.text = people.age.toString()

            //Set Item Click
            holder.itemView.setOnClickListener({
                Toast.makeText(mContext, people.name, Toast.LENGTH_SHORT).show()
            })
        }

    }

}