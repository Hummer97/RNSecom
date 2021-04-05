package com.rns.rnsecomapp.ui.WishList

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_my_bag.view.*
import kotlinx.android.synthetic.main.item_wish_list.view.*

class WishListAdapter(val context:Context,val response:WishListData) : RecyclerView.Adapter<WishListAdapter.MyWishListHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishListAdapter.MyWishListHolder {
        val inflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.item_wish_list, parent, false)
        return MyWishListHolder(view!!)
    }

    override fun onBindViewHolder(holder: WishListAdapter.MyWishListHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return  response.item!!.size
    }

    inner class MyWishListHolder(val itemView: View):RecyclerView.ViewHolder(itemView) {
            fun bind(position: Int)
            {
                Glide.with(itemView.context).load(Constant.BASE_URL + response.item?.get(position)?.productImage).into(itemView.item_wish_list_img)
                itemView.item_wish_list_title.text = response.item?.get(position)?.productName
                itemView.item_wish_list_price.text = "Rs "+response.item?.get(position)?.price
                itemView.item_wish_list_special_price.text = "Rs "+response.item?.get(position)?.specialPrice
            }
    }

}