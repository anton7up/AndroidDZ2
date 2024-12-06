package com.example.androiddz2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val image: ImageView = itemView.findViewById(R.id.imageView)
    val textView: TextView = itemView.findViewById(R.id.textView)
    val textView2: TextView = itemView.findViewById(R.id.textView2)
}