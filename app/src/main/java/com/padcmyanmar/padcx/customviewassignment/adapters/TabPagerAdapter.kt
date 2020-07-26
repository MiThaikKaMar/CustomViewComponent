package com.padcmyanmar.padcx.customviewassignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padcmyanmar.padcx.customviewassignment.fragments.TaskFragment

class TabPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return TaskFragment()
            1-> return TaskFragment()
            else -> return TaskFragment()
        }
    }
}