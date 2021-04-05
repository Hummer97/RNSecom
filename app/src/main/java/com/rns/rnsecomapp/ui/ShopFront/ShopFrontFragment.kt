package com.rns.rnsecomapp.ui.ShopFront

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.rns.rnsecomapp.Interfaces.Constant
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import com.rns.rnsecomapp.ui.AllCategories.AllCategoriesAdapter
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.dashboard.adapter.DashBoardArrivalAdapter
import kotlinx.android.synthetic.main.fragment_categories.*
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_shop_front.*
import org.json.JSONException

class ShopFrontFragment : BaseFragment<ShopFrontView,ShopFrontPresenter>(),ShopFrontView {
    private lateinit var mNavController:NavController
    override fun getContentView(): Int {
        return R.layout.fragment_shop_front
    }

    override fun getPresenterClass(): Class<ShopFrontPresenter> {
        return ShopFrontPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        mNavController = Navigation.findNavController(requireView())
        showProgressDialog("Please Wait...")
       // ProductListAPI()
        shop_front_filter_btn.setOnClickListener {
            Navigation.findNavController(shop_front_filter_btn).navigate(R.id.action_shopFrontFragment_to_productFilterFragment)
        }

        presenter?.getProduct()
    }

    override fun getProduct(response: ShopFrontModel) {
        shop_front_recyclerView.adapter = ShopFrontAdapter(requireContext(),response,object : RecyclerViewClickInterface{
            override fun OnItemClick(position: Int) {
                var id:String = response.productList!!.get(position).productsId.toString()

                var action: NavDirections = ShopFrontFragmentDirections.actionShopFrontFragmentToProductDetailsFragment(id)
                mNavController.navigate(action)


//                Navigation.findNavController(shop_front_recyclerView).navigate(R.id.action_shopFrontFragment_to_productDetailsFragment)

            }
            override fun OnItemLongClick(position: Int) {

            }

        })
    }
}