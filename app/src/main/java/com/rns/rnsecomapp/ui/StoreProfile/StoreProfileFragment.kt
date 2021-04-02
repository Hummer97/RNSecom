package com.rns.rnsecomapp.ui.StoreProfile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment

class StoreProfileFragment : BaseFragment<StoreProfileView,StoreProfilePresenter>(),StoreProfileView {
    override fun getContentView(): Int {
        return R.layout.fragment_store_profile
    }

    override fun getPresenterClass(): Class<StoreProfilePresenter> {
        return StoreProfilePresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
    }

}