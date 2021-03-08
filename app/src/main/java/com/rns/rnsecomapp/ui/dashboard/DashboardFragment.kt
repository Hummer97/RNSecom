package com.rns.rnsecomapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavAction
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.ui.dashboard.adapter.DashBoardAdapter
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : BaseFragment<DashboardView,DashboardPresenter>(),DashboardView {
    override fun getContentView(): Int {
        return R.layout.fragment_dashboard
    }

    override fun getPresenterClass(): Class<DashboardPresenter> {
        return DashboardPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

        dashboard_categories_rc.adapter = DashBoardAdapter(requireContext(),"Categories")
        dashboard_banner_rc.adapter = DashBoardAdapter(requireContext(),"Banner")
        dashboard_arrivals_recyclerView.adapter = DashBoardAdapter(requireContext(),"Arrivals")

        dashboard_view_all_categorie.setOnClickListener {
          Navigation.findNavController(dashboard_arrivals_recyclerView).navigate(R.id.action_navigation_dashboard_to_categoriesFragment)
        }

        dashboard_view_all_arrivals.setOnClickListener {
            Navigation.findNavController(dashboard_view_all_arrivals).navigate(R.id.action_navigation_dashboard_to_shopFrontFragment)
        }

    }

}