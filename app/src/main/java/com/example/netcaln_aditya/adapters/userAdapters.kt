package com.example.netcaln_aditya.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netcaln_aditya.R
import com.example.netcaln_aditya.dataClass.userData

class userAdapters(
    var userDataToInflate: ArrayList<userData>,
    private val onItemClick: (userData) -> Unit
):RecyclerView.Adapter<userAdapters.MyViewHolder>(){


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val userImage=itemView.findViewById<ImageView>(R.id.userImageView)
        val userName =itemView.findViewById<TextView>(R.id.userName)
        val userLocation  =itemView.findViewById<TextView>(R.id.userLocation)
        val userDescription =itemView.findViewById<TextView>(R.id.userDescription)
        val userTagLine = itemView.findViewById<TextView>(R.id.userTagline)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView = LayoutInflater.from(parent.context).
               inflate(R.layout.for_recycler_view,parent ,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return userDataToInflate.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = userDataToInflate[position]

        holder.userDescription.text=currentitem.userDescription
        holder.userImage.setImageResource(currentitem.userImage)
        holder.userName.text=currentitem.username
        holder.userLocation.text = currentitem.userLoaction
        holder.userTagLine.text = currentitem.userTagLines



    }
}