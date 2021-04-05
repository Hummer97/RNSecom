package com.rns.rnsecomapp.ui.dashboard

import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel
import com.rns.rnsecomapp.ui.dashboard.adapter.DashBoardArrivalAdapter
import com.rns.rnsecomapp.ui.dashboard.adapter.DashBoardBannerAdapter
import com.rns.rnsecomapp.ui.dashboard.adapter.DashBoardCategoryAdapter
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : BaseFragment<DashboardView, DashboardPresenter>(),DashboardView {
    private lateinit var mNavController: NavController
    override fun getContentView(): Int {
        return R.layout.fragment_dashboard
    }

    override fun getPresenterClass(): Class<DashboardPresenter> {
        return DashboardPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        mNavController = Navigation.findNavController(requireView())
//        dashboard_categories_rc.adapter = DashBoardAdapter(requireContext(),"Categories")
//        dashboard_banner_rc.adapter = DashBoardAdapter(requireContext(),"Banner")
//        dashboard_arrivals_recyclerView.adapter = DashBoardAdapter(requireContext(),"Arrivals")

        dashboard_view_all_categorie.setOnClickListener {
          Navigation.findNavController(dashboard_arrivals_rc).navigate(R.id.action_navigation_dashboard_to_categoriesFragment)
        }

        dashboard_view_all_arrivals.setOnClickListener {
            Navigation.findNavController(dashboard_view_all_arrivals).navigate(R.id.action_navigation_dashboard_to_shopFrontFragment)
        }

        presenter?.getCategory()
        presenter?.getBanner()
        presenter?.getArrival()

    }

    override fun getBannerResponse(response: BannerDataClass) {
        dashboard_banner_rc.adapter = DashBoardBannerAdapter(requireContext(), response)
    }

    override fun getCategoriesResponse(response: CategoriesModel) {
        Log.d("tag", "m" + response)
        dashboard_categories_rc.adapter = DashBoardCategoryAdapter(
                requireContext(),
                response,
                object : RecyclerViewClickInterface {
                    override fun OnItemClick(position: Int) {
                        Navigation.findNavController(dashboard_categories_rc)
                                .navigate(R.id.action_navigation_dashboard_to_categoriesFragment)
                    }

                    override fun OnItemLongClick(position: Int) {

                    }
                })
    }

    override fun getArrivalResponse(response: ShopFrontModel) {
        dashboard_arrivals_rc.adapter = DashBoardArrivalAdapter(
                requireContext(),
                response,
                object : RecyclerViewClickInterface {
                    override fun OnItemClick(position: Int) {
                        var id: String = response.productList!!.get(position).productsId.toString()

                        val action: NavDirections =
                                DashboardFragmentDirections.actionNavigationDashboardToProductDetailsFragment(
                                        id
                                )
                        mNavController.navigate(action)

//                    Navigation.findNavController(dashboard_view_all_arrivals)
//                        .navigate(R.id.action_navigation_dashboard_to_productDetailsFragment)
                    }

                    override fun OnItemLongClick(position: Int) {

                    }

                })
    }

}