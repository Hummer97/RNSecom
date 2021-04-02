package com.rns.rnsecomapp.ui.Seller.All_Sellers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.ui.Seller.ChoseSallerAdapter
import kotlinx.android.synthetic.main.fragment_all_sellers.*

class AllSellersFragment : BaseFragment<AllSellersView,AllSellersPresenter>(),AllSellersView {
    override fun getContentView(): Int {
        return R.layout.fragment_all_sellers
    }

    override fun getPresenterClass(): Class<AllSellersPresenter> {
        return AllSellersPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        seller_recyclerview.adapter = ChoseSallerAdapter(requireContext(),object :RecyclerViewClickInterface{
            override fun OnItemClick(position: Int) {
                Navigation.findNavController(seller_recyclerview).navigate(R.id.action_choseSallerFragment_to_shopFragment)
            }

            override fun OnItemLongClick(position: Int) {
                TODO("Not yet implemented")
            }
        })
    }


}