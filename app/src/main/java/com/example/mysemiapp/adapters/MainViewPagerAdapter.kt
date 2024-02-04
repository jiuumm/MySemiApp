package com.example.mysemiapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mysemiapp.fragments.BestDrawings
import com.example.mysemiapp.fragments.BestPictures
import com.example.mysemiapp.fragments.Groups
import com.example.mysemiapp.fragments.Home
import com.example.mysemiapp.fragments.MyProfile

class MainViewPagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if(position==0){
            return "Home"
        }
        else if(position==1){
            return "Best Drawings"
        }
        else if (position==2){
            return "Best Pictures"
        }
        else if(position==3){
            return "Groups"
        }
        else{
            return "Profile"
        }

    }
    override fun getItem(position: Int): Fragment {

        if(position==0){
            return Home()
        }
        else if(position==1){
            return BestDrawings()
        }
        else if (position==2){
            return BestPictures()
        }
        else if(position==3){
            return Groups()
        }
        else{
            return MyProfile()
        }


    }

}