package com.example.kotlinandroid.view.viewpager

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.example.kotlinandroid.R
import android.support.v4.app.FragmentManager

/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class ViewPagerActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)
        viewPager = findViewById(R.id.view_pager)
        var arrFragment: ArrayList<ViewFragment> = ArrayList()
        var fragmentOne = ViewFragment().newinstance("Titlte Fragment One")
        var fragmentTwo = ViewFragment()
        var fragmentThree = ViewFragment()
        arrFragment.add(fragmentOne)
        arrFragment.add(fragmentTwo)
        arrFragment.add(fragmentThree)
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, arrFragment)
    }
}