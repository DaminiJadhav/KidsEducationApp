package com.example.kidseducationapp.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.Toast
import com.example.kidseducationapp.R
import com.example.kidseducationapp.adapter.CustomAdapter
import com.example.kidseducationapp.fragment.KidsLearnerFragment
import com.example.kidseducationapp.model.LearnerItems
import kotlinx.android.synthetic.main.home_grid_item.view.*

class HomeActivity : AppCompatActivity() {

    var gridiew:GridView?=null

    var adapter: CustomAdapter? = null
    var foodsList = ArrayList<LearnerItems>()
    var foodsList1 = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        gridiew=findViewById(R.id.home_grid_view) as GridView


        foodsList.add(LearnerItems("A to Z", R.mipmap.iv_atoz))
        foodsList.add(LearnerItems("1 to 100", R.mipmap.iv_1to100))
        foodsList.add(LearnerItems("Colors", R.mipmap.iv_colors))
        foodsList.add(LearnerItems("Fruits", R.mipmap.i_fruits))
        foodsList.add(LearnerItems("Flowers",R.mipmap.iv_flowers))
        foodsList.add(LearnerItems("Animals",R.mipmap.iv_animals))
        foodsList.add(LearnerItems("Birds",R.mipmap.i_birds))
        foodsList.add(LearnerItems("Vegetables",R.mipmap.i_vegatables))


        adapter = CustomAdapter(this, foodsList)

        gridiew!!.adapter = adapter


        foodsList1.add("abc")
        foodsList1.add("df")
        foodsList1.add("abffc")
        foodsList1.add("fff")

//        val arrayListImage=ArrayList<Int>()

//        arrayListImage.add(R.drawable.iv_splash_scrren)
//        arrayListImage.add(R.drawable.iv_splash_scrren)
//        arrayListImage.add(R.drawable.iv_splash_scrren)
//        arrayListImage.add(R.drawable.iv_splash_scrren)
//        arrayListImage.add(R.drawable.iv_splash_scrren)
//        arrayListImage.add(R.drawable.iv_splash_scrren)
//
//        val arrayText= arrayOf("A to Z","1 to 100","Vegatables","Colors","Vehicle","Utensils")
//
//
//        val customeAdapter= CustomAdapter(this,arrayListImage,arrayText)
//        gridiew!!.adapter=customeAdapter

        gridiew?.setOnItemClickListener { parent, view, position, id ->

            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.add(R.id.home_activity,KidsLearnerFragment.newInstance("Value",foodsList1))
            Log.i("List",""+foodsList1)
            Toast.makeText(this,""+foodsList[position].name,Toast.LENGTH_LONG).show()
        }
    }


}
