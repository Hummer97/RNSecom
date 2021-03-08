package com.rns.rnsecomapp.ui.ProductDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_product_details.*


class ProductDetailsFragment : BaseFragment<ProductDetailsView,ProductDetailsPresenter>(),ProductDetailsView {
    override fun getContentView(): Int {
        return R.layout.fragment_product_details
    }

    override fun getPresenterClass(): Class<ProductDetailsPresenter> {
        return ProductDetailsPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        product_details_add_cart_btn.setOnClickListener {
            Navigation.findNavController(product_details_description).navigate(R.id.action_productDetailsFragment_to_myBagFragment)
        }
    }

}