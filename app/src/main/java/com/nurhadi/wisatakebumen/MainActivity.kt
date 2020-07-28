package com.nurhadi.wisatakebumen

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlace: RecyclerView
    private var list: ArrayList<Place> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvPlace = findViewById(R.id.rv_places)
        rvPlace.setHasFixedSize(true)

        list.addAll(PlacesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlace.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListPlaceAdapter(list)
        rvPlace.adapter = listHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {

        when (selectedMode) {
            R.id.action_about -> {
                moveToAbout()

            }

            R.id.action_credit -> {
                moveToCredit()
            }
        }
    }

    private fun moveToAbout() {
        val moveIntent = Intent(this@MainActivity,About::class.java)
        startActivity(moveIntent)
    }

    private fun moveToCredit() {
        val moveIntentCredit = Intent(this@MainActivity,CreditActivity::class.java)
        startActivity(moveIntentCredit)
    }
}