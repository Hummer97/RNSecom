package com.rns.rnsecomapp.ui.Seller

import android.os.Bundle
import androidx.navigation.Navigation
import com.bumptech.glide.manager.SupportRequestManagerFragment
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.ui.Seller.Adapter.SellerViewPagerAdapter
import com.rns.rnsecomapp.ui.Seller.All_Sellers.AllSellersFragment
import com.rns.rnsecomapp.ui.Seller.Promoted_Sellers.PromotedSellersFragment
import kotlinx.android.synthetic.main.fragment_chose_saller.*

class ChoseSallerFragment : BaseFragment<ChoseSallerView,ChoseSallerPresenter>(),ChoseSallerView {
    override fun getContentView(): Int {
        return R.layout.fragment_chose_saller
    }

    override fun getPresenterClass(): Class<ChoseSallerPresenter> {
        return ChoseSallerPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
            setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = SellerViewPagerAdapter(childFragmentManager)
        adapter.addFragment(AllSellersFragment(),"All Sellers")
        adapter.addFragment(PromotedSellersFragment(),"Promoted Sellers")
        chose_seller_viewPager.adapter = adapter
        chose_seller_TabLayout.setupWithViewPager(chose_seller_viewPager)
    }

}