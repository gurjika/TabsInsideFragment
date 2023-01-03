package com.example.mere

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mere.fragments.FragmentHelp1
import com.example.mere.fragments.FragmentHelp2

class ViewPagerFragmentAdapter (activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return FragmentHelp1()
        } else {
            return FragmentHelp2()
        }
    }

}