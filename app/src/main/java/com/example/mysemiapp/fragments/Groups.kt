package com.example.mysemiapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mysemiapp.R
import com.example.mysemiapp.ViewGroupActivity
import com.example.mysemiapp.adapters.GroupAdapter
import com.example.mysemiapp.databinding.FragmentBestGroupsBinding
import com.example.mysemiapp.datas.Group

class Groups : Fragment() {
    private var _binding: FragmentBestGroupsBinding? = null
    private val binding get() = _binding!!
    val mGroupList = ArrayList<Group>()
    lateinit var mAdapter : GroupAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBestGroupsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))
        mGroupList.add(Group("https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png", "Chab", "그림쟁이들의 모임"))

        mAdapter = GroupAdapter(requireContext(), R.layout.group_list_item, mGroupList)

        binding.groupListView.adapter = mAdapter
        binding.groupListView.setOnItemClickListener{ parent, view,position, id->

            val clickedStore= mGroupList[position]
            val myIntent = Intent(requireContext(), ViewGroupActivity::class.java)
            myIntent.putExtra("groupData", clickedStore)
            startActivity(myIntent)

        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // Access views using binding
        // Example: binding.textView.text = "Hello, View Binding!"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
