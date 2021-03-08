package com.rns.rnsecomapp.ui.ProductFilters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_product_filter.*


class ProductFilterFragment : BaseFragment<ProductFilterView,ProductFilterPresenter>(),ProductFilterView {
    override fun getContentView(): Int {
        return R.layout.fragment_product_filter
    }

    override fun getPresenterClass(): Class<ProductFilterPresenter> {
        return ProductFilterPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        val language = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
        brandRecylerview.adapter =Adapter(requireContext(), language)

        product_filter_apply_btn.setOnClickListener {
            Navigation.findNavController(product_filter_apply_btn).navigate(R.id.action_productFilterFragment_to_shopFrontFragment)
        }
        product_filter_cancel_btn.setOnClickListener {
            Navigation.findNavController(product_filter_apply_btn).navigate(R.id.action_productFilterFragment_to_shopFrontFragment)
        }
    }

}