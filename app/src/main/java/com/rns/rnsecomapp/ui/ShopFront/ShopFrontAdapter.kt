package com.rns.rnsecomapp.ui.ShopFront

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_category.view.*
import kotlinx.android.synthetic.main.item_product.view.*

class ShopFrontAdapter(val context : Context,private val product:ShopFrontModel,val mRecyclerViewClickInterface: RecyclerViewClickInterface ): RecyclerView.Adapter<ShopFrontAdapter.MyViewHolder>() {


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
        return product.productList!!.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(position:Int)
        {
            itemView.item_product_title.text = product.productList?.get(position)?.productName
            Picasso.with(context).load(Constant.BASE_URL+ product.productList?.get(position)?.productImage).placeholder(R.drawable.pic4).into(itemView.item_product_img)
            itemView.item_product_price.text = product.productList?.get(position)?.price
            itemView.shop_frant_main_layout.setOnClickListener {
                mRecyclerViewClickInterface.OnItemClick(position)
            }
        }

    }
}