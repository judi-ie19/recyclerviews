package com.example.reclyerviewsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reclyerviewsactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayView()


    }
    fun displayView(){
        val nameslist= listOf("misho","judy","siara","meollemn")
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        val namesAdapter=NamesRecyclerViewAdaptor(nameslist)
        binding.rvNames.adapter=namesAdapter
    }
}