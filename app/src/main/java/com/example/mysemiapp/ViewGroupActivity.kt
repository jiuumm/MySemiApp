package com.example.mysemiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.mysemiapp.databinding.ActivityViewGroupBinding
import com.example.mysemiapp.datas.Group

class ViewGroupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewGroupBinding
    private lateinit var mGroupData: Group

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewGroupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mGroupData = intent.getSerializableExtra("groupData") as Group
        Glide.with(this).load(mGroupData.img).into(binding.groupLogoImg)
        // Assuming you have an ImageView with the id "imageView" in your layout
        binding.name.text =mGroupData.name
        binding.introduce.text = mGroupData.introduce

    }
}
