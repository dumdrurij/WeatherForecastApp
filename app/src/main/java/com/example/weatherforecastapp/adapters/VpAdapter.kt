package com.example.weatherforecastapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

  class VpAdapter(fa:FragmentActivity, private val List: List<Fragment>) : FragmentStateAdapter(fa){

      override fun getItemCount(): Int {
          return List.size
      }


      override fun createFragment(position: Int): Fragment {
          return List[position]
      }

  }