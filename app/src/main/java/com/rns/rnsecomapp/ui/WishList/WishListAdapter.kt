package com.rns.rnsecomapp.ui.WishList

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.R

class WishListAdapter(val context:Context) : RecyclerView.Adapter<WishListAdapter.MyWishListHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishListAdapter.MyWishListHolder {
        val inflater = LayoutInflater.from(parent.context)
        var view:View
        view = inflater.inflate(R.layout.item_wish_list, parent, false)
        return MyWishListHolder(view!!)
    }

    override fun onBindViewHolder(holder: WishListAdapter.MyWishListHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return  10
    }

    inner class MyWishListHolder(val itemView: View):RecyclerView.ViewHolder(itemView) {

    }

}