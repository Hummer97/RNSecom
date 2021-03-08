package com.rns.rnsecomapp.ui.ShopFront

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_shop_front.*

class ShopFrontFragment : BaseFragment<ShopFrontView,ShopFrontPresenter>(),ShopFrontView,RecyclerViewClickInterface {
    override fun getContentView(): Int {
        return R.layout.fragment_shop_front
    }

    override fun getPresenterClass(): Class<ShopFrontPresenter> {
        return ShopFrontPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        shop_front_recyclerView.adapter = ShopFrontAdapter(requireContext(),this@ShopFrontFragment)
        shop_front_filter_btn.setOnClickListener {
            Navigation.findNavController(shop_front_filter_btn).navigate(R.id.action_shopFrontFragment_to_productFilterFragment)
        }
    }

    override fun OnItemClick(position: Int) {
        Navigation.findNavController(shop_front_recyclerView).navigate(R.id.action_shopFrontFragment_to_productDetailsFragment)
    }

    override fun OnItemLongClick(position: Int) {

    }

}