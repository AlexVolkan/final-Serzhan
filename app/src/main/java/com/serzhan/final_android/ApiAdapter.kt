package com.serzhan.final_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApiAdapter(private val apiItems: List<ApiItem>) : RecyclerView.Adapter<ApiAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.book_image)
        val descriptionTextView: TextView = itemView.findViewById(R.id.book_title)
        val categoryTextView: TextView = itemView.findViewById(R.id.book_author)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.d9584d15dab24435a278c9db5b624e3e, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val apiItem = apiItems[position]
        holder.nameTextView.text = apiItem.name
        holder.descriptionTextView.text = apiItem.description
        holder.categoryTextView.text = apiItem.category


        holder.itemView.setOnClickListener {
            // Handle item click event here
        }
    }

    override fun getItemCount(): Int {
        return apiItems.size
    }

    fun setData(apiItems: List<ApiItem>?) {

    }
}