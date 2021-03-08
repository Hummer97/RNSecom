package com.rns.rnsecomapp.ui.CardAddedSuccessful

import android.os.Bundle
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_payment_successful.*

class PaymentSuccessfulFragment : BaseFragment<PaymentSuccessfulView,PaymentSuccessfulPresenter>(),PaymentSuccessfulView {
    override fun getContentView(): Int {
        return R.layout.fragment_payment_successful
    }

    override fun getPresenterClass(): Class<PaymentSuccessfulPresenter> {
        return PaymentSuccessfulPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        card_added_continue_btn.setOnClickListener {
            Navigation.findNavController(card_added_continue_btn).navigate(R.id.action_paymentSuccessfulFragment_to_navigation_dashboard)
        }
    }

}