package com.example.uiapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.MotionEvent
import android.view.View
import android.view.View.OnHoverListener
import android.view.View.OnLongClickListener
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imvTags = findViewById<ImageView>(R.id.imvTags)
        val lnTags1 = findViewById<LinearLayout>(R.id.lnTags1)
        val lnTags2 = findViewById<LinearLayout>(R.id.lnTags2)
        val tvTag1 = findViewById<TextView>(R.id.tvTag1)
        val tvTag2 = findViewById<TextView>(R.id.tvTag2)
        val tvTag3 = findViewById<TextView>(R.id.tvTag3)
        val tvTag4 = findViewById<TextView>(R.id.tvTag4)
        val tvTag5 = findViewById<TextView>(R.id.tvTag5)
        val tvTag6 = findViewById<TextView>(R.id.tvTag6)
        val ct1 = findViewById<ConstraintLayout>(R.id.ct1)
        val ct2 = findViewById<ConstraintLayout>(R.id.ct2)
        val ct3 = findViewById<ConstraintLayout>(R.id.ct3)
        val ct4 = findViewById<ConstraintLayout>(R.id.ct4)

        var count = 0
        imvTags.setOnClickListener {
            count++
            if (count == 1) {
                imvTags.setImageResource(R.drawable.ic_arrow_down)
                lnTags1.visibility = View.GONE
                lnTags2.visibility = View.GONE
            }
            if (count == 2) {
                imvTags.setImageResource(R.drawable.ic_arrow_up)
                lnTags1.visibility = View.VISIBLE
                lnTags2.visibility = View.VISIBLE
                count = 0
            }
        }

        tvTag1.setOnClickListener {
            pressTextView(tvTag1, tvTag2, tvTag3, tvTag4, tvTag5, tvTag6)
        }

        tvTag2.setOnClickListener {
            pressTextView(tvTag2, tvTag1, tvTag3, tvTag4, tvTag5, tvTag6)
        }

        tvTag3.setOnClickListener {
            pressTextView(tvTag3, tvTag1, tvTag2, tvTag4, tvTag5, tvTag6)
        }

        tvTag4.setOnClickListener {
            pressTextView(tvTag4, tvTag1, tvTag2, tvTag3, tvTag5, tvTag6)
        }

        tvTag5.setOnClickListener {
            pressTextView(tvTag5, tvTag1, tvTag2, tvTag3, tvTag4, tvTag6)
        }

        tvTag6.setOnClickListener {
            pressTextView(tvTag6, tvTag1, tvTag2, tvTag3, tvTag4, tvTag5)
        }

        // ACTION_DOWN = PRESSED
        // ACTION_UP = RELEASED
        ct1.setOnTouchListener(object : OnTouchListener{
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                when (p1!!.action) {
                    MotionEvent.ACTION_DOWN -> {
                        ct1.setBackgroundColor(Color.parseColor("#8d7fb5"))
                    }
                    MotionEvent.ACTION_UP -> {
                        ct1.setBackgroundColor(Color.parseColor("#e6defc"))
                    }
                }
                return true
            }
        })

        ct2.setOnTouchListener(object : OnTouchListener{
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                when (p1!!.action) {
                    MotionEvent.ACTION_DOWN -> {
                        ct2.setBackgroundColor(Color.parseColor("#76b8a0"))
                    }
                    MotionEvent.ACTION_UP -> {
                        ct2.setBackgroundColor(Color.parseColor("#dcf5ec"))
                    }
                }
                return true
            }
        })

        ct3.setOnTouchListener(object : OnTouchListener{
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                when (p1!!.action) {
                    MotionEvent.ACTION_DOWN -> {
                        ct3.setBackgroundColor(Color.parseColor("#9e9c9b"))
                    }
                    MotionEvent.ACTION_UP -> {
                        ct3.setBackgroundColor(Color.parseColor("#262221"))
                    }
                }
                return true
            }
        })

        ct4.setOnTouchListener(object : OnTouchListener{
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                when (p1!!.action) {
                    MotionEvent.ACTION_DOWN -> {
                        ct4.setBackgroundColor(Color.parseColor("#b59b6d"))
                    }
                    MotionEvent.ACTION_UP -> {
                        ct4.setBackgroundColor(Color.parseColor("#f2e7d3"))
                    }
                }
                return true
            }
        })

    }

    private fun pressTextView(tvPress: TextView, tv1: TextView, tv2: TextView,
                              tv3: TextView, tv4: TextView, tv5: TextView) {
        tvPress.setBackgroundResource(R.drawable.bgr_press)
        tvPress.setTextColor(resources.getColor(R.color.white))

        tv1.setBackgroundResource(R.drawable.bgr_empty)
        tv1.setTextColor(resources.getColor(R.color.black))

        tv2.setBackgroundResource(R.drawable.bgr_empty)
        tv2.setTextColor(resources.getColor(R.color.black))

        tv3.setBackgroundResource(R.drawable.bgr_empty)
        tv3.setTextColor(resources.getColor(R.color.black))

        tv4.setBackgroundResource(R.drawable.bgr_empty)
        tv4.setTextColor(resources.getColor(R.color.black))

        tv5.setBackgroundResource(R.drawable.bgr_empty)
        tv5.setTextColor(resources.getColor(R.color.black))
    }
}