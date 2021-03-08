package com.rns.rnsecomapp.ui.PaymentHistory

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.R

class PaymentHistoryAdapter(val context:Context): RecyclerView.Adapter<PaymentHistoryAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentHistoryAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var view:View
        view = inflater.inflate(R.layout.item_payment_history, parent, false)
        return MyViewHolder(view!!)
    }

    override fun onBindViewHolder(holder: PaymentHistoryAdapter.MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

    class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    }
}