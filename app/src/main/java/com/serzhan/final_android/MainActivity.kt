package com.serzhan.final_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var apiViewModel: ApiViewModel
    private lateinit var apiAdapter: ApiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        apiViewModel = ViewModelProvider(this).get(ApiViewModel::class.java)
        apiAdapter = ApiAdapter(emptyList())
        recyclerView.adapter = apiAdapter

        apiViewModel.apiItems.observe(this, { apiItems ->
            apiAdapter.setData(apiItems)
        })

        apiViewModel.fetchPublicApis()
    }
}