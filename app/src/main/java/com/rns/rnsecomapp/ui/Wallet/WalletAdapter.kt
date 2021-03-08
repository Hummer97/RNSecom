package com.rns.rnsecomapp.ui.Wallet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.R

class WalletAdapter(val context: Context): RecyclerView.Adapter<WalletAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(context)
        var view:View
        view = inflater.inflate(R.layout.item_last_transaction,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: WalletAdapter.MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

    class MyViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}