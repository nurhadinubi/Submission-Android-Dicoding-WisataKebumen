package com.nurhadi.wisatakebumen

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlin.math.exp

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title ="Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val personalInfo:LinearLayout = findViewById(R.id.personal_info)
        val experience:LinearLayout = findViewById(R.id.experience)
        val tvInfo:TextView = findViewById(R.id.personalinfobtn)
        val tvExp:TextView = findViewById(R.id.experiencebtn)

        /*Setting Tab Info pas Loading*/
        personalInfo.visibility = View.VISIBLE
        experience.visibility = View.GONE
        tvInfo.setTextColor(Color.parseColor("#356859"))
        tvExp.setTextColor(Color.DKGRAY)

        tvInfo.setOnClickListener(){
            personalInfo.visibility = View.VISIBLE
            experience.visibility = View.GONE
            tvInfo.setTextColor(Color.parseColor("#356859"))
            tvExp.setTextColor(Color.DKGRAY)
        }
        tvExp.setOnClickListener(){
            experience.visibility = View.VISIBLE
            personalInfo.visibility = View.GONE

            tvInfo.setTextColor(Color.DKGRAY)
            tvExp.setTextColor(Color.parseColor("#356859"))
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}