package com.rns.rnsecomapp.ui.Saller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_seller.view.*

class ChoseSallerAdapter(val context: Context,val recyclerViewClickInterface: RecyclerViewClickInterface):RecyclerView.Adapter<ChoseSallerAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int)
        {
            itemView.item_seller_main_layout.setOnClickListener {
                recyclerViewClickInterface.OnItemClick(position)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater = LayoutInflater.from(context)
        var view: View = inflater.inflate(R.layout.item_seller,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 10
    }
}