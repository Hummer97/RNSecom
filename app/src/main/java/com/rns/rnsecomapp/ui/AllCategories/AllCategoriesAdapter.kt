package com.rns.rnsecomapp.ui.AllCategories

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

class AllCategoriesAdapter(val context: Context, private var categoryList: CategoriesModel, var mRecyclerViewClickInterface: RecyclerViewClickInterface): RecyclerView.Adapter<AllCategoriesAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        var view:View
        view = inflater.inflate(R.layout.item_category, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)

    }

    override fun getItemCount(): Int {
        return categoryList.category!!.size
    }

    inner class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int)
        {
            itemView.category_title.text = categoryList.category?.get(position)?.categoryName
            Picasso.with(context).load(Constant.BASE_URL+ categoryList.category?.get(position)?.image).placeholder(R.drawable.pic4).into(itemView.category_image)
            itemView.item_category_mainLayout.setOnClickListener {
                mRecyclerViewClickInterface.OnItemClick(position)
            }
        }

    }
}