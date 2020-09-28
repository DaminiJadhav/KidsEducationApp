package com.example.kidseducationapp.fragment

import android.content.Intent
import android.icu.text.CaseMap
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kidseducationapp.R
import com.example.kidseducationapp.model.LearnerItems
import kotlinx.android.synthetic.main.activity_home.view.*

class KidsLearnerFragment:Fragment(){
    companion object{
        private val ARG_CAUGHT = "myFragment_caught"


        fun newInstance(title: String,arrayList: ArrayList<String>):KidsLearnerFragment{

//            val bundle:Bundle?=null
//            bundle?.putSerializable(ARG_CAUGHT,arrayList)
//            Log.i("List 1",""+arrayList)
//            val fragment=KidsLearnerFragment()
//            fragment.arguments=bundle

            val fragment = KidsLearnerFragment()
            val args = Bundle()
            args.putString(ARG_CAUGHT, arrayList.toString())
            fragment.setArguments(args)
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Toast.makeText(context,"go to fragment", Toast.LENGTH_LONG).show()

        return inflater.inflate(R.layout.fragment_kids_items ,container,false)
    }
}