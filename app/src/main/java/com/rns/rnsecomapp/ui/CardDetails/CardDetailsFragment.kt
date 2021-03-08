package com.rns.rnsecomapp.ui.CardDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment


class CardDetailsFragment : BaseFragment<CardDetailsView,CardDetailsPresenter>(),CardDetailsView {
    override fun getContentView(): Int {
        return R.layout.fragment_card_details
    }

    override fun getPresenterClass(): Class<CardDetailsPresenter> {
        return CardDetailsPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

}