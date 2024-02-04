package com.example.mysemiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysemiapp.adapters.MainViewPagerAdapter
import com.example.mysemiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var mViewPagerAdapter : MainViewPagerAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mViewPagerAdapter
        binding.myTabLayout.setupWithViewPager(binding.mainViewPager)
    }
}
