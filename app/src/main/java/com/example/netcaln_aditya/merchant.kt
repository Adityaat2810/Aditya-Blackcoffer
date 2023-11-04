package com.example.netcaln_aditya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netcaln_aditya.adapters.mercahnt_adapter
import com.example.netcaln_aditya.dataClass.userData
import com.example.netcaln_aditya.databinding.FragmentMerchantBinding

class merchant : Fragment() {

    private lateinit var userDataToInflate: ArrayList<userData>
    private lateinit var binding:FragmentMerchantBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMerchantBinding.inflate(inflater, container, false)
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
            "",
            "",
            "",
            "",
            "",
            "",
        )


        val userHeadline = arrayOf(
            "Hi community, We have great deals for you check us out ",
            "Hi community, We have great deals for you check us out ",
            "Hi community, We have great deals for you check us out ",
            "Hi community, We have great deals for you check us out ",
            "Hi community, We have great deals for you check us out ",
            "Hi community, We have great deals for you check us out ",




            )

        myRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        userDataToInflate = ArrayList()
        for (index in userImageArray.indices) {
            val user = userData(userNameArray[index],userImageArray[index],userLoactionArray[index],userDescriptionArray[index],userHeadline[index])
            userDataToInflate.add(user)
        }

        //set up the adapter
        val adapter = mercahnt_adapter(userDataToInflate){

        }

        myRecyclerView.adapter = adapter


        return view
    }

}