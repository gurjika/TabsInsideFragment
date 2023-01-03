package com.example.mere.fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.mere.R
import com.example.mere.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class jeiloba:Fragment(R.layout.fragment_jeiloba) {
    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = view.findViewById(R.id.tableLayout)
        viewPager2 = view.findViewById(R.id.viewPager)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(requireActivity() as AppCompatActivity)

        viewPager2.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            tab.text = "Tab ${position + 1} "
        }.attach()
    }


}