package com.rns.rnsecomapp.ui.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.item_brand.view.*
import kotlinx.coroutines.flow.emptyFlow

class DashBoardAdapter(val context:Context,var type:String): RecyclerView.Adapter<DashBoardAdapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var view1:View?=null
        var view2:View?=null
        if(type.equals("Categories")){
            view2 = inflater.inflate(R.layout.item_database_category, parent, false)
            return MyViewHolder(view2!!)
        }else if(type.equals("Banner")){
            view1= inflater.inflate(R.layout.item_dashboard_banner, parent, false)
            return MyViewHolder(view1!!)

        }else{
            view1= inflater.inflate(R.layout.item_dashbord_arrival, parent, false)
            return MyViewHolder(view1!!)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

//        fun bind(position: Int){
//            if(type==""){
//                itemView.item_brand.text = dataList[position]
//            }else{
//                itemView.item_brand.text = dataList[position]
//            }

        }

    }

