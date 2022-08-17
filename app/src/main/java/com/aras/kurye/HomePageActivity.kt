package com.aras.kurye

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.aras.kurye.databinding.ActivityHomepageBinding

class HomePageActivity: AppCompatActivity() {

    lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding=ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}