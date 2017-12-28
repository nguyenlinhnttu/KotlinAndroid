package com.example.kotlinandroid.view.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinandroid.R
import kotlinx.android.synthetic.main.fragment_view.*


/**
 * Created by nguyenvanlinh on 12/28/17.
 */
class ViewFragment : Fragment() {

    val TITLE_FRAGMENT: String = "TITLE_FRAGMENT"

    fun newinstance(title: String): ViewFragment {
        var viewFragment = ViewFragment()
        var bundle = Bundle()
        bundle.putString(TITLE_FRAGMENT, title)
        viewFragment.arguments = bundle
        return viewFragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = LayoutInflater.from(activity).inflate(R.layout.fragment_view, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        if (arguments != null) {
            var title :String = arguments.get(TITLE_FRAGMENT).toString()
            tv_fragment_number.text  = title
        }
    }
}