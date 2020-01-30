package com.example.reuesview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragment_RecyclerView = Recycler_view()
//        val manager = supportFragmentManager
//        val transaction = manager.beginTransaction()
//        transaction.replace(R.id.layout, fragment_RecyclerView,"fragment_RecyclerView")
//        transaction.addToBackStack("fragment_list_view")
//        transaction.commit()


        //  val fragment_list_view = ListView()
        val fragment_login = login()
        val manager = supportFragmentManager;
        val transaction = manager.beginTransaction();
        transaction.replace(R.id.layout,fragment_login,"fragment_login")
        transaction.addToBackStack("fragment_login");
        transaction.commit();




    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//
//    }
}
