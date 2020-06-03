package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                tv_box_two,
                tv_boxthree,
                tv_boxfour,
                tvboxfive,
                btn_Red,
                btn_Green,
                btn_Yellow
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private
    fun makeColored(view: View){
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.tv_boxthree -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tv_boxfour -> view.setBackgroundResource(android.R.color.background_dark)
            R.id.tvboxfive -> view.setBackgroundResource(android.R.color.holo_green_light)



            // Boxes using custom colors for background
            R.id.btn_Red -> tv_boxthree.setBackgroundResource(R.color.clr_Red)
            R.id.btn_Yellow -> tv_boxfour.setBackgroundResource(R.color.clr_Yellow)
            R.id.btn_Green -> tvboxfive.setBackgroundResource(R.color.clr_Green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
