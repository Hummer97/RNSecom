package com.rns.rnsecomapp.ui.ShopFront

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_product.view.*

class ShopFrontAdapter(val context : Context, val mRecyclerViewClickInterface: RecyclerViewClickInterface ): RecyclerView.Adapter<ShopFrontAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater = LayoutInflater.from(context)
        var view: View
        view = inflater.inflate(R.layout.item_product,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(position:Int)
        {
            itemView.shop_frant_main_layout.setOnClickListener {
                mRecyclerViewClickInterface.OnItemClick(position)
            }
        }

    }
}