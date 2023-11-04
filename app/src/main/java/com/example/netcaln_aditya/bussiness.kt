package com.example.netcaln_aditya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netcaln_aditya.adapters.business_adapter
import com.example.netcaln_aditya.dataClass.userData
import com.example.netcaln_aditya.databinding.FragmentPersonalBinding


class bussiness : Fragment() {

    private lateinit var userDataToInflate: ArrayList<userData>
    private lateinit var binding: FragmentPersonalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonalBinding.inflate(inflater, container, false)
        val view = binding.root

        val myRecyclerView = binding.recyclerView

        val userImageArray = arrayOf(
            R.drawable.person1,
            R.drawable.person2,
            R.drawable.person3,
            R.drawable.person4,
            R.drawable.person5,
            R.drawable.person6



        )

        val userNameArray= arrayOf(
            "aditya saini",
            "david bautista",
            "roman reigns",
            "philip lackner",
            "manikesh yadav",
            "priyanshu singh"
        )

        val userLoactionArray = arrayOf(
            "meerut,within 1km",
            "ranchi,within 1.8km",
            "delhi,within 2km",
            "Amsterdam,within 2.4km",
            "Mumbai,within 5km",
            "delhi,within 7km"
        )

        val userDescriptionArray = arrayOf(
            "Freelancer | 2 years of experience",
            "Internship Student | 1 year of experience",
            "Associate Qa Engineer 0 year of experience",
            "Freelancer |0 year of experience",
            "Internship Student | 1 year of experience ",
            "Freelancer | 2 years of experience",
        )


        val userHeadline = arrayOf(
            "Hi community, I am available at your service ",
            "Hi community, I am available at your service",
            "Hi community, I am available at your service ",
            "Hi community, I am available at your service",
            "Hi community, I am available at your service  ",
            "Hi community, I am available at your service ",




            )

        myRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        userDataToInflate = ArrayList()
        for (index in userImageArray.indices) {
            val user = userData(userNameArray[index],userImageArray[index],userLoactionArray[index],userDescriptionArray[index],userHeadline[index])
            userDataToInflate.add(user)
        }

        //set up the adapter
        val adapter = business_adapter(userDataToInflate){

        }

        myRecyclerView.adapter = adapter


        return view
    }


}