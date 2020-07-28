package com.nurhadi.wisatakebumen

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListPlaceAdapter(private val listPlaces: ArrayList<Place>): RecyclerView.Adapter<ListPlaceAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_place, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun getItemCount(): Int {
        return listPlaces.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val place = listPlaces[position]

        Glide.with(holder.itemView.context)
            .load(place.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = place.name
        holder.tvDetail.text = place.detail
        holder.tvlokasi.text = place.location

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPlace::class.java)

            moveDetail.putExtra(DetailPlace.EXTRA_NAME, place.name)
            moveDetail.putExtra(DetailPlace.EXTRA_PHOTO, place.photo)
            moveDetail.putExtra(DetailPlace.EXTRA_LOCATION, place.location)
            moveDetail.putExtra(DetailPlace.EXTRA_DETAIL, place.detail)
            moveDetail.putExtra(DetailPlace.EXTRA_GEO,place.geo)

            mContext.startActivity(moveDetail)
        }
    }



    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvlokasi: TextView = itemView.findViewById(R.id.tv_item_lokasi)
    }

}