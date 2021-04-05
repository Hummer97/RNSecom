package com.rns.rnsecomapp.ui.MyBag

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_my_bag.view.*
import kotlinx.android.synthetic.main.item_product_details_image.view.*

class MyBagAdapter(val context: Context, val response:MyCartDataClass): RecyclerView.Adapter<MyBagAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.item_my_bag,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return response.item!!.size
    }
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int)
        {
            Glide.with(itemView.context).load(Constant.BASE_URL + response.item?.get(position)?.productImage).into(itemView.item_my_bag_img)
            itemView.item_my_bag_title.text = response.item?.get(position)?.productName
            itemView.item_my_bag_price.text = response.item?.get(position)?.price
            itemView.item_my_bag_special_price.text = response.item?.get(position)?.specialPrice
            itemView.item_my_bag_quantity.text = "Qty: "+response.item?.get(position)?.quantity
        }

    }

}