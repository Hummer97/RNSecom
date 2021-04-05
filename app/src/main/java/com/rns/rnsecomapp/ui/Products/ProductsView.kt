package com.rns.rnsecomapp.ui.Products

import com.rns.rnsecomapp.base.BaseView
import com.rns.rnsecomapp.datamodel.CategoryWiseProductModel
import okhttp3.ResponseBody

interface ProductsView : BaseView {
    fun getProducrListData(responseBody: CategoryWiseProductModel)
}