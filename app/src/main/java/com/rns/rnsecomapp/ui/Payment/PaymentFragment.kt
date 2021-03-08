package com.rns.rnsecomapp.ui.Payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.base.BaseView
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : BaseFragment<PaymentView,PaymentPresenter>(),PaymentView {
    override fun getContentView(): Int {
        return R.layout.fragment_payment
    }

    override fun getPresenterClass(): Class<PaymentPresenter> {
        return PaymentPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        payment_recyclerview.adapter = PaymentAdapter(requireContext())

        payment_pay_btn.setOnClickListener {
            Navigation.findNavController(payment_pay_btn).navigate(R.id.action_paymentFragment_to_congratulationsFragment)
        }
    }

}