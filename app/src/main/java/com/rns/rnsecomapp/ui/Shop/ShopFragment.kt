package com.rns.rnsecomapp.ui.Shop

import android.os.Bundle
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment

class ShopFragment : BaseFragment<ShopView,ShopPresenter>(),ShopView {
    override fun getContentView(): Int {
        return R.layout.fragment_shop
    }

    override fun getPresenterClass(): Class<ShopPresenter> {
        return ShopPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

    }

}