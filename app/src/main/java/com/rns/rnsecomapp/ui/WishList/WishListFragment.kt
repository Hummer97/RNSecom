package com.rns.rnsecomapp.ui.WishList

import android.os.Bundle
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_wish_list.*

class WishListFragment : BaseFragment<WishListView,WishListPresenter>(),WishListView{
    override fun getContentView(): Int {
        return R.layout.fragment_wish_list
    }

    override fun getPresenterClass(): Class<WishListPresenter> {
        return WishListPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
            wish_list_recyclerView.adapter = WishListAdapter(requireContext())
    }

}