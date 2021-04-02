package com.rns.rnsecomapp.ui.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontAdapter
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_dashbord_arrival.view.*
import kotlinx.android.synthetic.main.item_database_category.view.*
import kotlinx.android.synthetic.main.item_product.view.*

class DashBoardArrivalAdapter(val context : Context, private val product:ShopFrontModel, val onClickInterface:RecyclerViewClickInterface): RecyclerView.Adapter<DashBoardArrivalAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater = LayoutInflater.from(context)
        var view: View
        view = inflater.inflate(R.layout.item_dashbord_arrival,parent,false)
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
            itemView.item_dashboard_arrival_title.setText(product.productList!!.get(position).productName)
            itemView.item_dashboard_arrival_offer_price.setText(product.productList!!.get(position).price)

            Glide.with(itemView.context).load(Constant.BASE_URL+ product.productList?.get(position)?.productImage).into(itemView.item_dashboard_arrival_img)
            itemView.item_dashboard_arrival_mainLayout.setOnClickListener {
                onClickInterface.OnItemClick(position)
            }
        }

    }
}