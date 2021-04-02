package com.rns.rnsecomapp.ui.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.dashboard.BannerDataClass
import kotlinx.android.synthetic.main.item_dashboard_banner.view.*
import kotlinx.android.synthetic.main.item_database_category.view.*
import java.util.zip.Inflater

class DashBoardBannerAdapter(val context: Context, private var bannerList: BannerDataClass) :RecyclerView.Adapter<DashBoardBannerAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int)
        {
            Glide.with(itemView.context).load(Constant.BASE_URL + bannerList.banner?.get(position)?.image).into(itemView.item_dashboard_banner_img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view:View = inflater.inflate(R.layout.item_dashboard_banner,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return bannerList.banner!!.size
    }
}