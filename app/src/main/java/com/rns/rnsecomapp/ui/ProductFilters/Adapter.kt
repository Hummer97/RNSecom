package com.rns.rnsecomapp.ui.ProductFilters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_brand.view.*

class Adapter(val context:Context,val dataList:Array<String>): RecyclerView.Adapter<Adapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_brand, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         holder.bind(position)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int){
            itemView.item_brand.text = dataList[position]
        }




    }

}