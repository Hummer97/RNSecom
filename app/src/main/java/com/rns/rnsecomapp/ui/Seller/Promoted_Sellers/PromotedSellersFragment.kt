package com.rns.rnsecomapp.ui.Seller.Promoted_Sellers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment

class PromotedSellersFragment : BaseFragment<PromotedSellersView,PromotedSellersPresenter>(),PromotedSellersView {
    override fun getContentView(): Int {
        return R.layout.fragment_promoted_sellers
    }

    override fun getPresenterClass(): Class<PromotedSellersPresenter> {
        return PromotedSellersPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

    }


}