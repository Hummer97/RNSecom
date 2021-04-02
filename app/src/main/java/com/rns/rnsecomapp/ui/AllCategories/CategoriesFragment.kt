package com.rns.rnsecomapp.ui.AllCategories

import android.app.ProgressDialog
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.navigation.Navigation

import com.rns.rnsecomapp.Interfaces.RecyclerViewClickInterface
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_categories.*
import org.json.JSONException

class CategoriesFragment : BaseFragment<CategoryView, CategoryPresenter>(),CategoryView {

    override fun getContentView(): Int {
        return R.layout.fragment_categories
    }

    override fun getPresenterClass(): Class<CategoryPresenter> {
        return CategoryPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        showProgressDialog("Please wait...")

        presenter?.getCategoray()
    }

    override fun getResponse(response: CategoriesModel) {
        Log.d("tag","m"+response)
        all_categorie_recyclerView.adapter = AllCategoriesAdapter(requireContext(),response,object :RecyclerViewClickInterface{
            override fun OnItemClick(position: Int) {
                Navigation.findNavController(all_categorie_recyclerView).navigate(R.id.action_categoriesFragment_to_choseSallerFragment)

            }

            override fun OnItemLongClick(position: Int) {

            }
        })

    }


}

