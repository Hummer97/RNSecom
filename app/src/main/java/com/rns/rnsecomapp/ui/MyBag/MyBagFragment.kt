package com.rns.rnsecomapp.ui.MyBag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_my_bag.*


class MyBagFragment : BaseFragment<MyBagView,MyBagPresenter>(),MyBagView {
    override fun getContentView(): Int {
        return R.layout.fragment_my_bag
    }

    override fun getPresenterClass(): Class<MyBagPresenter> {
        return MyBagPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
            my_bag_recyclerview.adapter = MyBagAdapter(requireContext())

        my_bag_checkout_btn.setOnClickListener {
            Navigation.findNavController(my_bag_checkout_btn).navigate(R.id.action_myBagFragment_to_checkoutFragment)
        }
    }

}