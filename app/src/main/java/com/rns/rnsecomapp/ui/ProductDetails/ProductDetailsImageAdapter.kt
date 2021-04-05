package com.rns.rnsecomapp.ui.ProductDetails

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.bumptech.glide.request.target.Target
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_database_category.view.*
import kotlinx.android.synthetic.main.item_product_details_image.view.*


class ProductDetailsImageAdapter(var context: Context, var response: ProductDetailsData):RecyclerView.Adapter<ProductDetailsImageAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        var view:View =inflater.inflate(R.layout.item_product_details_image, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return response.image!!.size
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int)
        {
            Glide.with(itemView.context).load(Constant.BASE_URL + response.image?.get(position).toString()).into(itemView.item_product_details_img)
            Glide.with(itemView.context).load(Constant.BASE_URL + response.image?.get(position).toString()).into(itemView.item_product_details_image_bg)

        }
    }

}