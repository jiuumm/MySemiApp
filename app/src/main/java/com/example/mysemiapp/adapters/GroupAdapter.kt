package com.example.mysemiapp.adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.R
import com.bumptech.glide.Glide
import com.example.mysemiapp.datas.Group
import org.w3c.dom.Text

class GroupAdapter(val mContext: Context,
    val resId: Int,
    val mList : ArrayList<Group>):ArrayAdapter<Group>(mContext, resId, mList) {

        val inf = LayoutInflater.from(mContext)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow==null){
            tempRow = inf.inflate(com.example.mysemiapp.R.layout.group_list_item, null)
        }
        val row = tempRow!!


        val groupData = mList[position]

        val nameTxt = row.findViewById<TextView>(com.example.mysemiapp.R.id.nameTxt)
        val introTxt = row.findViewById<TextView>(com.example.mysemiapp.R.id.introduceTxt)

        nameTxt.text= groupData.name
        introTxt.text = groupData.introduce

        val img = row.findViewById<ImageView>(com.example.mysemiapp.R.id.ImageView)
        Glide.with(mContext).load(groupData.img).into(img)


        return row
    }
}