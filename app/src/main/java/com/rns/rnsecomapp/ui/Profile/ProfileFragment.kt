package com.rns.rnsecomapp.ui.Profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : BaseFragment<ProfileView,ProfilePresenter>(),ProfileView {
    override fun getContentView(): Int {
        return R.layout.fragment_profile
    }

    override fun getPresenterClass(): Class<ProfilePresenter> {
        return ProfilePresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

        profile_order_history.setOnClickListener {
            Navigation.findNavController(profile_order_history).navigate(R.id.action_navigation_account_to_paymentHistoryFragment)
        }

        profile_balance.setOnClickListener {
            Navigation.findNavController(profile_balance).navigate(R.id.action_navigation_account_to_walletFragment)
        }

        profile_setting.setOnClickListener {
            Navigation.findNavController(profile_setting).navigate(R.id.action_navigation_account_to_settingFragment)
        }


    }

}