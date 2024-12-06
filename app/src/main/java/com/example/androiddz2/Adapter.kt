package com.example.androiddz2

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list: List<ViewModel>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.textView.text = item.id.toString()
        holder.textView2.text = item.description
        holder.image.apply{
            setImageResource(item.image)
            setOnClickListener { Toast.makeText(context, holder.textView2.text.toString(), Toast.LENGTH_SHORT).show() }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
