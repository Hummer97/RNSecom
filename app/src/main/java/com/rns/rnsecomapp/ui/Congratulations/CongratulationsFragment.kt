package com.rns.rnsecomapp.ui.Congratulations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_congratulations.*

class CongratulationsFragment : BaseFragment<CongratulationsView,CongratulationsPresenter>(),CongratulationsView {
    override fun getContentView(): Int {
        return R.layout.fragment_congratulations
    }

    override fun getPresenterClass(): Class<CongratulationsPresenter> {
        return CongratulationsPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        congratulations_continue_btn.setOnClickListener {
            Navigation.findNavController(congratulations_continue_btn).navigate(R.id.action_congratulationsFragment_to_navigation_dashboard)
        }
    }

}