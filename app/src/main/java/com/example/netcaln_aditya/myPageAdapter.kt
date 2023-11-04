package com.example.netcaln_aditya

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class myPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifecycle) {

        override fun getItemCount(): Int = 3 // Number of fragments
        override fun createFragment(position: Int): Fragment {
            return when (position) {

                0-> Personal_Fragment()
                1-> bussiness()
                2-> merchant()
                else -> throw IllegalArgumentException("Invalid position")
            }
        }
    }