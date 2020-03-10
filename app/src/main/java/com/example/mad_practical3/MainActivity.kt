package com.example.mad_practical3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.button_red -> box_three.setBackgroundResource(R.color.my_red)
            R.id.button_yellow -> box_four.setBackgroundResource(R.color.my_yellow)
            R.id.button_green -> box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three)
        val boxFourText = findViewById<TextView>(R.id.box_four)
        val boxFiveText = findViewById<TextView>(R.id.box_five)
        val redButton = findViewById<TextView>(R.id.button_red)
        val greenButton = findViewById<TextView>(R.id.button_green)
        val yellowButton = findViewById<TextView>(R.id.button_yellow)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                        redButton, greenButton, yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }


    }
}
