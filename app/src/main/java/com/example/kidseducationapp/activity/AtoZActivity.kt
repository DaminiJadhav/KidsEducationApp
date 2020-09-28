package com.example.kidseducationapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.kidseducationapp.R

class AtoZActivity : AppCompatActivity() {


    var gridView:GridView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ato_z)

        gridView=findViewById(R.id.a_to_z_grid_view) as GridView





    }
}
