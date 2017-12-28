package com.example.kotlinandroid.view.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.kotlinandroid.R
import kotlinx.android.synthetic.main.item_list_view.view.*

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class ItemHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    var tvName: TextView = itemView!!.tv_name
    var tvAge: TextView = itemView!!.tv_age
}