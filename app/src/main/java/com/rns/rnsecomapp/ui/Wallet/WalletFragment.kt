package com.rns.rnsecomapp.ui.Wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_wallet.*

class WalletFragment : BaseFragment<WalletView,WalletPresenter>(),WalletView {
    override fun getContentView(): Int {
        return R.layout.fragment_wallet
    }

    override fun getPresenterClass(): Class<WalletPresenter> {
        return WalletPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

        wallet_payment_recyclerView.adapter = WalletAdapter(requireContext())

        wallet_add_card_btn.setOnClickListener {
            Navigation.findNavController(wallet_add_card_btn).navigate(R.id.action_walletFragment_to_paymentSuccessfulFragment)
        }

    }

}