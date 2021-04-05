package com.rns.rnsecomapp.ui.WishList

import android.os.Bundle
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.SharedPrefManager.SharedPrefManager
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_wish_list.*

class WishListFragment : BaseFragment<WishListView,WishListPresenter>(),WishListView{
    private lateinit var sharedPrefManager: SharedPrefManager
    private lateinit var mUser_Id:String
    override fun getContentView(): Int {
        return R.layout.fragment_wish_list
    }

    override fun getPresenterClass(): Class<WishListPresenter> {
        return WishListPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        sharedPrefManager = SharedPrefManager.getInstance(requireContext())
        mUser_Id = sharedPrefManager.user.id.toString()

        presenter!!.getWishListResponse(mUser_Id)
    }

    override fun getWishListResponse(response: WishListData) {
        if(response.status == 200)
        {
            wish_list_recyclerView.adapter = WishListAdapter(requireContext(),response)
        }

    }

}