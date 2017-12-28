package com.example.kotlinandroid.view.viewpager

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.widget.TabHost
import com.example.kotlinandroid.R


/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class ViewPagerActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)
        var arrFragment: ArrayList<ViewFragment> = ArrayList()
        var fragmentOne = ViewFragment().newinstance("Titlte Fragment One")
        var fragmentTwo = ViewFragment()
        var fragmentThree = ViewFragment()
        arrFragment.add(fragmentOne)
        arrFragment.add(fragmentTwo)
        arrFragment.add(fragmentThree)
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, arrFragment)
        tabLayout.setupWithViewPager(viewPager)
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }
}