package com.rns.rnsecomapp.ui.Shipping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_shipping.*


class ShippingFragment : BaseFragment<ShippingView,ShippingPresenter>(),ShippingView {
    override fun getContentView(): Int {
        return R.layout.fragment_shipping
    }

    override fun getPresenterClass(): Class<ShippingPresenter> {
        return ShippingPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        shipping_continue_btn.setOnClickListener {
            Navigation.findNavController(shipping_continue_btn).navigate(R.id.action_shippingFragment_to_paymentFragment)
        }
    }

}