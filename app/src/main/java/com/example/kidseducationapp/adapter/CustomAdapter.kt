package com.example.kidseducationapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.kidseducationapp.R
import com.example.kidseducationapp.model.LearnerItems
import kotlinx.android.synthetic.main.home_grid_item.view.*

class CustomAdapter : BaseAdapter {
        var ItemList = ArrayList<LearnerItems>()
        var context: Context? = null

        constructor(context: Context, foodsList: ArrayList<LearnerItems>) : super() {
            this.context = context
            this.ItemList = foodsList
        }

        override fun getCount(): Int {
            return ItemList.size
        }

        override fun getItem(position: Int): Any {
            return ItemList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val item = this.ItemList[position]

            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var learnView = inflator.inflate(R.layout.home_grid_item, null)
            learnView.kids_img.setImageResource(item.image!!)
            learnView.kids_text.text = item.name!!

            return learnView
        }
    }