package com.kashsoft.todoapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter : RecyclerView.Adapter<Adapter.viewHolder>() {
    class viewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView){
            var title = itemView.title
            var priority  = itemView.priority
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
       var itemView=  LayoutInflater.from(parent.context).inflate(R.layout.view
       ,parent,false)
        return viewHolder(itemView)

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}