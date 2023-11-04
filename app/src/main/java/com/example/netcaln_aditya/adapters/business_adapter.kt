package com.example.netcaln_aditya.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netcaln_aditya.R
import com.example.netcaln_aditya.dataClass.userData


class business_adapter(
        var userDataToInflate: ArrayList<userData>,
         val onItemClick: (userData) -> Unit
    ): RecyclerView.Adapter<business_adapter.MyViewHolder>(){


        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val userImage=itemView.findViewById<ImageView>(R.id.userImageView)
            val userName =itemView.findViewById<TextView>(R.id.userName)
            val userLocation  =itemView.findViewById<TextView>(R.id.userLocation)
            val userDescription =itemView.findViewById<TextView>(R.id.userDescription)
            val userTagLine = itemView.findViewById<TextView>(R.id.userTagline)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(parent.context).
            inflate(R.layout.business_inflate,parent ,false)
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
