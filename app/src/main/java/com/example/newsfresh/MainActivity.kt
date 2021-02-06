package com.example.newsfresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject


class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = NewsListAdapter(items, this)
        recyclerView.adapter = adapter
    }
        private fun fetchData()
        val url = "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=de886701f66a4c23bc635a91e3e014c9"
        val jsonObjectRequest = JsonObjectRequest(

        )


    }

    override fun onItemClicked(item: String) {
       Toast.makeText( this, "clicked item is $item", Toast.LENGTH_LONG).show()
    }

}