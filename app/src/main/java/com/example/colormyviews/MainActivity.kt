package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //makes function in tbe main class
        setListeners()
        val redButton = findViewById<Button>(R.id.btn_Red)
        val greenButton = findViewById<Button>(R.id.btn_Green)
        val yellowButton = findViewById<Button>(R.id.btn_Yellow)
        val randomButton = findViewById<Button>(R.id.btn_Random)
        val resetButton = findViewById<Button>(R.id.btn_Reset)
        val goCrazy = findViewById<Button>(R.id.btn_GoCrazy)
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                tv_box_two,
                tv_boxthree,
                tv_boxfour,
                tvboxfive,
                btn_GoCrazy,
                btn_Red,
                btn_Green,
                btn_Yellow,
                btn_Random,
                btn_Reset,
                constraint_layout
            )
        val buttonArray = arrayOf(btn_Green, btn_Yellow, btn_Red)
        fun changeColors (colorz:Int){
            for (items in clickableViews.minus(buttonArray)){
                items.setBackgroundColor(colorz)
            }
        }
        goCrazy.setOnClickListener { for (items in clickableViews.minus(buttonArray)) {
            items.setBackgroundColor(Random.nextInt())
        } }

        resetButton.setOnClickListener {
            finish()
            startActivity(intent)
        }

        randomButton.setOnClickListener {
            changeColors(Random.nextInt())
        }
        redButton.setOnClickListener {
            changeColors(Color.RED)
        }
        greenButton.setOnClickListener {
            changeColors(Color.GREEN)
        }
        yellowButton.setOnClickListener {
            changeColors(Color.YELLOW)
        }
    }


    //creates unction which creates value which makes list clickable
    public fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                tv_box_two,
                tv_boxthree,
                tv_boxfour,
                tvboxfive,
                btn_Red,
                btn_Green,
                btn_Yellow,
                constraint_layout
            )
        //sets on click listeners for all views to use make colored function
        for (item in clickableViews) {
            item.setOnClickListener { item.setBackgroundColor(Random.nextInt()) }
        }

    }


}

