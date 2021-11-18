package com.example.whatsappclone.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabViewPagerAdapter(
    private val fragmentList: ArrayList<Fragment>,
    fragmentManger: FragmentManager,
    lifeCycle: Lifecycle
) : FragmentStateAdapter(fragmentManger, lifeCycle) {
    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList[position]

}