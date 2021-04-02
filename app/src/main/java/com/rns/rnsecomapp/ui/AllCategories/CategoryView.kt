package com.rns.rnsecomapp.ui.AllCategories

import com.rns.rnsecomapp.base.BaseView

interface CategoryView:BaseView {
    fun getResponse(response: CategoriesModel)

}