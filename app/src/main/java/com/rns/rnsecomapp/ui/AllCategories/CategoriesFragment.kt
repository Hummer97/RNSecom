package com.rns.rnsecomapp.ui.AllCategories

import android.os.Bundle
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_categories.*
import org.json.JSONException
import org.json.JSONObject

class CategoriesFragment : BaseFragment<CategoriesView, CategoriesPresenter>(),CategoriesView,RecyclerViewClickInterface {
    override fun getContentView(): Int {
        return R.layout.fragment_categories
    }

    override fun getPresenterClass(): Class<CategoriesPresenter> {
        return CategoriesPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {



        all_categorie_recyclerView.adapter = AllCategoriesAdapter(requireContext(), this@CategoriesFragment)

    }

    override fun OnItemClick(position: Int) {
        Navigation.findNavController(all_categorie_recyclerView).navigate(R.id.action_categoriesFragment_to_choseSallerFragment)
    }

    override fun OnItemLongClick(position: Int) {

    }

}