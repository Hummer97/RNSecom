package com.rns.rnsecomapp.ui.PaymentHistory

import android.os.Bundle
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_payment_history.*


class PaymentHistoryFragment : BaseFragment<PaymentHistoryView,PaymentHistoryPresenter>(),PaymentHistoryView {
    override fun getContentView(): Int {
        return R.layout.fragment_payment_history
    }

    override fun getPresenterClass(): Class<PaymentHistoryPresenter> {
        return PaymentHistoryPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

        payment_history_recyclerView.adapter = PaymentHistoryAdapter(requireContext())

    }

}