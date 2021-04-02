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
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import kotlinx.android.synthetic.main.item_database_category.view.*

class DashBoardCategoryAdapter(val context:Context, private var categoryList: CategoriesModel, var mRecyclerViewClickInterface: RecyclerViewClickInterface): RecyclerView.Adapter<DashBoardCategoryAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var view: View? = null
        view = inflater.inflate(R.layout.item_database_category, parent, false)
        return MyViewHolder(view!!)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return categoryList.category!!.size;
    }

    inner class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int) {
            itemView.item_dashboard_categories_title.setText(categoryList.category!!.get(position).categoryName)
            Glide.with(itemView.context).load(Constant.BASE_URL+ categoryList.category!!.get(position).image).into(itemView.item_dashboard_categories_img)
            itemView.item_dashboard_categories_img.setOnClickListener {
                mRecyclerViewClickInterface.OnItemClick(position)
            }
        }

    }
}

