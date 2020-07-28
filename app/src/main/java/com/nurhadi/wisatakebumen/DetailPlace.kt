package com.nurhadi.wisatakebumen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailPlace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_place)
        val actionbar = supportActionBar


        val imgDetailPhoto:ImageView = findViewById(R.id.img_item_photo)
        val tvSetLocation:TextView = findViewById(R.id.tv_location)
        val tvSetDetail:TextView = findViewById(R.id.tv_detail)
        val fabMaps:FloatingActionButton = findViewById(R.id.fab_maps)


        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tLoc = intent.getStringExtra(EXTRA_LOCATION)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tGeo = intent.getStringExtra(EXTRA_GEO)

        fabMaps.setOnClickListener(){
            val mapsIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:$tGeo"))
            startActivity(mapsIntent)
        }

        actionbar!!.title =tName.toString()
        actionbar.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgDetailPhoto)
        tvSetLocation.text = "Lokasi : $tLoc"
        tvSetDetail.text = tDetail
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_GEO = "extra_geo"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}