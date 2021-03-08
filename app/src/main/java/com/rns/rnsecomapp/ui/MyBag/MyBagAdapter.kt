package com.rns.rnsecomapp.ui.MyBag

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R

class MyBagAdapter(val context: Context): RecyclerView.Adapter<MyBagAdapter.MyViewHolder>() {
   inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

       fun bind(position: Int)
       {

       }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater = LayoutInflater.from(context)
        var view:View
        view = inflater.inflate(R.layout.item_my_bag,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 10
    }
}