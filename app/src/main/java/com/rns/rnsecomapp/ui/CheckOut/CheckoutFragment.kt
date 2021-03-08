package com.rns.rnsecomapp.ui.CheckOut

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_checkout.*

class CheckoutFragment : BaseFragment<CheckoutView,CheckoutPresenter>(),CheckoutView {
    override fun getContentView(): Int {
        return R.layout.fragment_checkout
    }

    override fun getPresenterClass(): Class<CheckoutPresenter> {
        return CheckoutPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        checkout_checkout_btn.setOnClickListener {
            Navigation.findNavController(checkout_checkout_btn).navigate(R.id.action_checkoutFragment_to_shippingFragment)
        }
    }

}