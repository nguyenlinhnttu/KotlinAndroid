package com.example.kotlinandroid.appleanmath

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinandroid.R
import kotlinx.android.synthetic.main.activity_math2.*

class Math2Activity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math2)
        btn_chia.setOnClickListener(this)
        btn_cong.setOnClickListener(this)
        btn_tru.setOnClickListener(this)
        btn_nhan.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) when(p0.id){

            btn_cong.id -> tv_result.text ="Result: " + (edt_value_a.text.toString().toInt() + edt_value_b.text.toString().toInt())
            btn_tru.id -> {
                val a = edt_value_a.text.toString().toInt()
                val b =  edt_value_b.text.toString().toInt()
                tv_result.text ="Result: " + (a - b)
            }
            btn_chia.id -> {
                val a = edt_value_a.text.toString().toInt()
                val b =  edt_value_b.text.toString().toInt()
                tv_result.text ="Result: " + (a / b)
            }
            btn_nhan.id -> {
                val a = edt_value_a.text.toString().toInt()
                val b =  edt_value_b.text.toString().toInt()
                tv_result.text ="Result: " + (a * b)
            }
        }
    }
}
