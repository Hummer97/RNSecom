package com.rns.rnsecomapp.ui.Shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.ui.Products.ProductsFragment
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontFragment
import com.rns.rnsecomapp.ui.StoreProfile.StoreProfileFragment
import kotlinx.android.synthetic.main.fragment_shop.*

class ShopFragment : BaseFragment<ShopView,ShopPresenter>(),ShopView {
    override fun getContentView(): Int {
        return R.layout.fragment_shop
    }

    override fun getPresenterClass(): Class<ShopPresenter> {
        return ShopPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

        val fragment: Fragment = ShopFrontFragment()
        val fragmentManager: FragmentManager?= fragmentManager
        fragmentManager?.beginTransaction()?.replace(R.id.shop_fragment_container,fragment)?.commit()

        shop_fragment_shop_front_btn.setOnClickListener {
            val fragment: Fragment = ShopFrontFragment()
            val fragmentManager: FragmentManager?= fragmentManager
            fragmentManager?.beginTransaction()?.replace(R.id.shop_fragment_container,fragment)?.commit()
        }
        fragmentManager?.beginTransaction()?.replace(R.id.shop_fragment_container,fragment)?.commit()
        shop_fragment_product_btn.setOnClickListener {
            val fragment: Fragment = ProductsFragment()
            val fragmentManager: FragmentManager?= fragmentManager
            fragmentManager?.beginTransaction()?.replace(R.id.shop_fragment_container,fragment)?.commit()
        }
        fragmentManager?.beginTransaction()?.replace(R.id.shop_fragment_container,fragment)?.commit()
        shop_fragment_store_profile_btn.setOnClickListener {
            val fragment: Fragment = StoreProfileFragment()
            val fragmentManager: FragmentManager?= fragmentManager
            fragmentManager?.beginTransaction()?.replace(R.id.shop_fragment_container,fragment)?.commit()
        }
    }

}