package com.rns.rnsecomapp.ui.Saller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_chose_saller.*

class ChoseSallerFragment : BaseFragment<ChoseSallerView,ChoseSallerPresenter>(),ChoseSallerView,RecyclerViewClickInterface {
    override fun getContentView(): Int {
        return R.layout.fragment_chose_saller
    }

    override fun getPresenterClass(): Class<ChoseSallerPresenter> {
        return ChoseSallerPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        seller_recyclerview.adapter = ChoseSallerAdapter(requireContext(),this@ChoseSallerFragment)
    }

    override fun OnItemClick(position: Int) {
        Navigation.findNavController(seller_recyclerview).navigate(R.id.action_choseSallerFragment_to_shopFragment)
    }

    override fun OnItemLongClick(position: Int) {

    }

}