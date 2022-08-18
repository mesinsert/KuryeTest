package com.aras.kurye

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.aras.kurye.databinding.ActivityHomepageBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomePageActivity: AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding

    val numberArray = arrayOf("FIRST", "SECOND", "THIRD")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_homepage)

        val adapter = TabsAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = numberArray[position]
        }.attach()


    }

}