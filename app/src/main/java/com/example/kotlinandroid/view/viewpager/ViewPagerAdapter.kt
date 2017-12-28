package com.example.kotlinandroid.view.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class ViewPagerAdapter : FragmentPagerAdapter {
    private var fm: FragmentManager
    private var arrFragment: ArrayList<ViewFragment>

    constructor(fm: FragmentManager, arrFragment: ArrayList<ViewFragment>) : super(fm) {
        this.fm = fm
        this.arrFragment = arrFragment
    }


    override fun getItem(position: Int): Fragment {
        return arrFragment[position];
    }

    override fun getCount(): Int {
        return arrFragment.size
    }

    //Title TabLayout here
    override fun getPageTitle(position: Int): CharSequence {
        var title :String = ""
        when (position) {
            0 -> title = "One"
            1 -> title = "Two"
            2 -> title = "Three"
        }
        return title
    }

}