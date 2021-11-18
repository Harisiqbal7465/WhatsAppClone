package com.example.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.whatsappclone.adapter.TabViewPagerAdapter
import com.example.whatsappclone.databinding.ActivityMainBinding
import com.example.whatsappclone.fragments.CallsFragment
import com.example.whatsappclone.fragments.ChatsFragment
import com.example.whatsappclone.fragments.StatusFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViewPagerAdapter()
    }

    private fun setViewPagerAdapter() {
        val fragmentList: ArrayList<Fragment> = arrayListOf(
            ChatsFragment(),
            StatusFragment(),
            CallsFragment()
        )

        val adapter = TabViewPagerAdapter(
            fragmentList,
            supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "CHATS"
                    tab.orCreateBadge.apply {
                        isVisible = true
                        number = 12
                    }
                }
                1 -> {
                    tab.text = "STATUS"
                }
                2 -> {
                    tab.text = "CALLS"
                }
            }
        }.attach()
    }
}