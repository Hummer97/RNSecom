package com.rns.rnsecomapp.ui.Products

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment

class ProductsFragment : BaseFragment<ProductsView,ProductsPresenter>(),ProductsView {
    override fun getContentView(): Int {
        return R.layout.fragment_products
    }

    override fun getPresenterClass(): Class<ProductsPresenter> {
        return ProductsPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

    }

}